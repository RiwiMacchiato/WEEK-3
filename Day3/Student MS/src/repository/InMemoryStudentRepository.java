package src.repository;

import java.util.ArrayList;
import java.util.HashMap;
import src.models.Student;

public class InMemoryStudentRepository implements StudentRepository {
    
    // HashMap to store students with ID as key - mimics database table
    private HashMap<String, Student> students;
    
    public InMemoryStudentRepository() {
        this.students = new HashMap<>();
    }
    
    @Override
    public boolean save(Student student) {
        if (student == null || student.getId() == null) {
            return false;
        }
        
        students.put(student.getId(), student);
        return true;
    }
    
    @Override
    public Student findById(String id) {
        if (id == null) {
            return null;
        }
        
        return students.get(id);
    }
    
    @Override
    public boolean deleteById(String id) {
        if (id == null) {
            return false;
        }
        
        Student removed = students.remove(id);
        return removed != null;
    }
    
    @Override
    public ArrayList<Student> findAll() {
        return new ArrayList<>(students.values());
    }
    
    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
    
    @Override
    public int getCount() {
        return students.size();
    }
    
    /**
     * Find students by major
     * @param major Major to search for
     * @return ArrayList of students with matching major
     */
    public ArrayList<Student> findByMajor(String major) {
        ArrayList<Student> result = new ArrayList<>();
        
        if (major == null) {
            return result;
        }
        
        for (Student student : students.values()) {
            if (major.equalsIgnoreCase(student.getMajor())) {
                result.add(student);
            }
        }
        
        return result;
    }
    
    /**
     * Find students by name (partial match)
     * @param name Name to search for
     * @return ArrayList of students with matching name
     */
    public ArrayList<Student> findByName(String name) {
        ArrayList<Student> result = new ArrayList<>();
        
        if (name == null) {
            return result;
        }
        
        for (Student student : students.values()) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }
        
        return result;
    }
}