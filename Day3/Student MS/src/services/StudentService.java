package src.services;

import java.util.ArrayList;
import src.models.Student;
import src.repository.InMemoryStudentRepository;
import src.repository.StudentRepository;

public class StudentService {
    
    private StudentRepository repository;
    
    public StudentService() {
        this.repository = new InMemoryStudentRepository();
    }
    
    /**
     * Add a new student to the system
     * @param id Student ID
     * @param name Student name
     * @param ageStr Age as string
     * @param major Student major
     * @param gpaStr GPA as string
     * @param semesterStr Semester as string
     * @return AddResult with success status and message
     */
    public AddResult addStudent(String id, String name, String ageStr, String major, String gpaStr, String semesterStr) {
        // Basic validation
        if (id == null || id.trim().isEmpty()) {
            return new AddResult(false, "Student ID cannot be empty!");
        }
        
        if (name == null || name.trim().isEmpty()) {
            return new AddResult(false, "Student name cannot be empty!");
        }
        
        if (major == null || major.trim().isEmpty()) {
            return new AddResult(false, "Major cannot be empty!");
        }
        
        // Check for duplicate ID
        if (repository.findById(id.trim()) != null) {
            return new AddResult(false, "Student with ID '" + id.trim() + "' already exists!");
        }
        
        // Parse and validate age
        int age;
        try {
            age = Integer.parseInt(ageStr.trim());
            if (age <= 0 || age > 120) {
                return new AddResult(false, "Age must be between 1 and 120!");
            }
        } catch (NumberFormatException e) {
            return new AddResult(false, "Please enter a valid age!");
        }
        
        // Parse and validate GPA
        double gpa;
        try {
            gpa = Double.parseDouble(gpaStr.trim());
            if (gpa < 0.0 || gpa > 4.0) {
                return new AddResult(false, "GPA must be between 0.0 and 4.0!");
            }
        } catch (NumberFormatException e) {
            return new AddResult(false, "Please enter a valid GPA!");
        }
        
        // Parse and validate semester
        int semester;
        try {
            semester = Integer.parseInt(semesterStr.trim());
            if (semester <= 0 || semester > 20) {
                return new AddResult(false, "Semester must be between 1 and 20!");
            }
        } catch (NumberFormatException e) {
            return new AddResult(false, "Please enter a valid semester!");
        }
        
        // Create and save student
        Student student = new Student(id.trim(), name.trim(), age, major.trim(), gpa, semester);
        boolean saved = repository.save(student);
        
        if (saved) {
            return new AddResult(true, "Student added successfully!");
        } else {
            return new AddResult(false, "Failed to add student!");
        }
    }
    
    /**
     * Find a student by ID
     * @param id Student ID to search for
     * @return Student if found, null otherwise
     */
    public Student findStudentById(String id) {
        if (id == null || id.trim().isEmpty()) {
            return null;
        }
        
        return repository.findById(id.trim());
    }
    
    /**
     * Delete a student by ID
     * @param id Student ID to delete
     * @return DeleteResult with success status and message
     */
    public DeleteResult deleteStudent(String id) {
        if (id == null || id.trim().isEmpty()) {
            return new DeleteResult(false, "Student ID cannot be empty!");
        }
        
        Student student = repository.findById(id.trim());
        if (student == null) {
            return new DeleteResult(false, "Student with ID '" + id.trim() + "' not found!");
        }
        
        boolean deleted = repository.deleteById(id.trim());
        if (deleted) {
            return new DeleteResult(true, "Student deleted successfully!");
        } else {
            return new DeleteResult(false, "Failed to delete student!");
        }
    }
    
    /**
     * Get all students
     * @return ArrayList of all students
     */
    public ArrayList<Student> getAllStudents() {
        return repository.findAll();
    }
    
    /**
     * Search students by name
     * @param name Name to search for
     * @return ArrayList of matching students
     */
    public ArrayList<Student> searchStudentsByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return new ArrayList<>();
        }
        
        if (repository instanceof InMemoryStudentRepository) {
            return ((InMemoryStudentRepository) repository).findByName(name.trim());
        }
        
        return new ArrayList<>();
    }
    
    /**
     * Search students by major
     * @param major Major to search for
     * @return ArrayList of matching students
     */
    public ArrayList<Student> searchStudentsByMajor(String major) {
        if (major == null || major.trim().isEmpty()) {
            return new ArrayList<>();
        }
        
        if (repository instanceof InMemoryStudentRepository) {
            return ((InMemoryStudentRepository) repository).findByMajor(major.trim());
        }
        
        return new ArrayList<>();
    }
    
    /**
     * Check if the system has any students
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return repository.isEmpty();
    }
    
    /**
     * Get total number of students
     * @return count of students
     */
    public int getStudentCount() {
        return repository.getCount();
    }
    
    /**
     * Get system statistics
     * @return Statistics object
     */
    public SystemStats getStatistics() {
        ArrayList<Student> allStudents = repository.findAll();
        
        if (allStudents.isEmpty()) {
            return new SystemStats(0, 0.0, null, null);
        }
        
        double totalGPA = 0.0;
        Student highestGPA = allStudents.get(0);
        Student lowestGPA = allStudents.get(0);
        
        for (Student student : allStudents) {
            totalGPA += student.getGpa();
            
            if (student.getGpa() > highestGPA.getGpa()) {
                highestGPA = student;
            }
            
            if (student.getGpa() < lowestGPA.getGpa()) {
                lowestGPA = student;
            }
        }
        
        double averageGPA = totalGPA / allStudents.size();
        
        return new SystemStats(allStudents.size(), averageGPA, highestGPA, lowestGPA);
    }
    
    // Result classes
    
    /**
     * Result class for add student operations
     */
    public static class AddResult {
        private boolean success;
        private String message;
        
        public AddResult(boolean success, String message) {
            this.success = success;
            this.message = message;
        }
        
        public boolean isSuccess() {
            return success;
        }
        
        public String getMessage() {
            return message;
        }
    }
    
    /**
     * Result class for delete student operations
     */
    public static class DeleteResult {
        private boolean success;
        private String message;
        
        public DeleteResult(boolean success, String message) {
            this.success = success;
            this.message = message;
        }
        
        public boolean isSuccess() {
            return success;
        }
        
        public String getMessage() {
            return message;
        }
    }
    
    /**
     * Statistics class for system information
     */
    public static class SystemStats {
        private int totalStudents;
        private double averageGPA;
        private Student highestGPA;
        private Student lowestGPA;
        
        public SystemStats(int totalStudents, double averageGPA, Student highestGPA, Student lowestGPA) {
            this.totalStudents = totalStudents;
            this.averageGPA = averageGPA;
            this.highestGPA = highestGPA;
            this.lowestGPA = lowestGPA;
        }
        
        public int getTotalStudents() {
            return totalStudents;
        }
        
        public double getAverageGPA() {
            return averageGPA;
        }
        
        public Student getHighestGPA() {
            return highestGPA;
        }
        
        public Student getLowestGPA() {
            return lowestGPA;
        }
    }
}