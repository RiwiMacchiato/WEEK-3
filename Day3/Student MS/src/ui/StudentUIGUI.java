package src.ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import src.models.Student;
import src.services.StudentService;

public class StudentUIGUI {
    
    private final StudentService service;
    
    public StudentUIGUI() {
        this.service = new StudentService();
    }
    
    /**
     * Start the student management system with JOptionPane GUI
     */
    public void start() {
        // Welcome message
        JOptionPane.showMessageDialog(null,
            "Welcome to Student Management System!\n\n" +
            "This system allows you to:\n" +
            "• Add new students\n" +
            "• Find students by ID\n" +
            "• List all students\n" +
            "• Search students by name or major\n" +
            "• Delete students\n" +
            "• View system statistics",
            "Student Management System",
            JOptionPane.INFORMATION_MESSAGE);
        
        // Main program loop
        boolean running = true;
        while (running) {
            running = showMainMenu();
        }
        
        // Show final summary when exiting
        showFinalSummary();
    }
    
    /**
     * Display the main menu and handle user selection
     * @return true to continue running, false to exit
     */
    private boolean showMainMenu() {
        String menu = "=== STUDENT MANAGEMENT SYSTEM ===\n\n" +
                "Select an option:\n" +
                "1. Add Student\n" +
                "2. Find Student by ID\n" +
                "3. List All Students\n" +
                "4. Search Students\n" +
                "5. Delete Student\n" +
                "6. Show Statistics\n" +
                "7. Exit\n\n" +
                "Enter your choice (1-7):";

        String choice = JOptionPane.showInputDialog(null, menu, "Main Menu", JOptionPane.QUESTION_MESSAGE);

        // Handle if user cancels or closes dialog
        if (choice == null) {
            return false;
        }

        try {
            int option = Integer.parseInt(choice.trim());

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    findStudent();
                    break;
                case 3:
                    listAllStudents();
                    break;
                case 4:
                    searchStudents();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    showStatistics();
                    break;
                case 7:
                    return false; // Exit the program
                default:
                    JOptionPane.showMessageDialog(null,
                        "Invalid option! Enter a number between 1 and 7.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Enter a valid number!",
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE);
        }

        return true;
    }
    
    private void addStudent() {
        String id = JOptionPane.showInputDialog(null,
            "Enter Student ID:",
            "Add New Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (id == null) return; // User cancelled
        
        String name = JOptionPane.showInputDialog(null,
            "Enter Student Name:",
            "Add New Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (name == null) return;
        
        String age = JOptionPane.showInputDialog(null,
            "Enter Age:",
            "Add New Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (age == null) return;
        
        String major = JOptionPane.showInputDialog(null,
            "Enter Major:",
            "Add New Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (major == null) return;
        
        String gpa = JOptionPane.showInputDialog(null,
            "Enter GPA (0.0 - 4.0):",
            "Add New Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (gpa == null) return;
        
        String semester = JOptionPane.showInputDialog(null,
            "Enter Current Semester:",
            "Add New Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (semester == null) return;
        
        StudentService.AddResult result = service.addStudent(id, name, age, major, gpa, semester);
        
        if (result.isSuccess()) {
            JOptionPane.showMessageDialog(null,
                result.getMessage(),
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                result.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void findStudent() {
        if (service.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "No students in the system!",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog(null,
            "Enter Student ID to find:",
            "Find Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (id == null) return;
        
        Student student = service.findStudentById(id);
        
        if (student != null) {
            JOptionPane.showMessageDialog(null,
                "Student Found:\n\n" + student,
                "Student Information",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                "Student with ID '" + id + "' not found!",
                "Not Found",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void listAllStudents() {
        ArrayList<Student> students = service.getAllStudents();
        
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "No students in the system!",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Total Students: ").append(students.size()).append("\n\n");
        
        for (int i = 0; i < students.size(); i++) {
            sb.append(i + 1).append(". ").append(students.get(i)).append("\n");
        }
        
        JOptionPane.showMessageDialog(null,
            sb.toString(),
            "All Students",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void searchStudents() {
        if (service.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "No students in the system!",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String searchMenu = "=== SEARCH STUDENTS ===\n\n" +
                "Select search type:\n" +
                "1. Search by Name\n" +
                "2. Search by Major\n\n" +
                "Enter your choice (1-2):";

        String searchChoice = JOptionPane.showInputDialog(null, searchMenu, "Search Students", JOptionPane.QUESTION_MESSAGE);
        
        if (searchChoice == null) return; // User cancelled
        
        try {
            int option = Integer.parseInt(searchChoice.trim());
            ArrayList<Student> results = new ArrayList<>();
            String searchTerm = "";
            
            switch (option) {
                case 1:
                    searchTerm = JOptionPane.showInputDialog(null,
                        "Enter name to search:",
                        "Search by Name",
                        JOptionPane.QUESTION_MESSAGE);
                    
                    if (searchTerm == null) return;
                    results = service.searchStudentsByName(searchTerm);
                    break;
                case 2:
                    searchTerm = JOptionPane.showInputDialog(null,
                        "Enter major to search:",
                        "Search by Major",
                        JOptionPane.QUESTION_MESSAGE);
                    
                    if (searchTerm == null) return;
                    results = service.searchStudentsByMajor(searchTerm);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                        "Invalid option! Enter 1 or 2.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    return;
            }
            
            if (results.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "No students found for: " + searchTerm,
                    "Search Results",
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Search Results (").append(results.size()).append(" found):\n\n");
                
                for (int i = 0; i < results.size(); i++) {
                    sb.append(i + 1).append(". ").append(results.get(i)).append("\n");
                }
                
                JOptionPane.showMessageDialog(null,
                    sb.toString(),
                    "Search Results",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Enter a valid number!",
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void deleteStudent() {
        if (service.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "No students in the system!",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String id = JOptionPane.showInputDialog(null,
            "Enter Student ID to delete:",
            "Delete Student",
            JOptionPane.QUESTION_MESSAGE);
        
        if (id == null) return;
        
        // First, show the student to be deleted
        Student student = service.findStudentById(id);
        if (student != null) {
            int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete this student?\n\n" + student,
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
            
            if (confirm == JOptionPane.YES_OPTION) {
                StudentService.DeleteResult result = service.deleteStudent(id);
                
                if (result.isSuccess()) {
                    JOptionPane.showMessageDialog(null,
                        result.getMessage(),
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                        result.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                    "Delete operation cancelled.",
                    "Cancelled",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                "Student with ID '" + id + "' not found!",
                "Not Found",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void showStatistics() {
        StudentService.SystemStats stats = service.getStatistics();
        
        StringBuilder sb = new StringBuilder();
        sb.append("=== SYSTEM STATISTICS ===\n\n");
        sb.append("Total Students: ").append(stats.getTotalStudents()).append("\n");
        
        if (stats.getTotalStudents() > 0) {
            sb.append("Average GPA: ").append(String.format("%.2f", stats.getAverageGPA())).append("\n\n");
            sb.append("Highest GPA Student:\n");
            sb.append(stats.getHighestGPA()).append("\n\n");
            sb.append("Lowest GPA Student:\n");
            sb.append(stats.getLowestGPA());
        } else {
            sb.append("\nNo students in the system to show statistics.");
        }
        
        JOptionPane.showMessageDialog(null,
            sb.toString(),
            "System Statistics",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void showFinalSummary() {
        StudentService.SystemStats stats = service.getStatistics();
        
        StringBuilder sb = new StringBuilder();
        sb.append("Thank you for using Student Management System!\n\n");
        sb.append("Final Summary:\n");
        sb.append("Total Students: ").append(stats.getTotalStudents()).append("\n");
        
        if (stats.getTotalStudents() > 0) {
            sb.append("Average GPA: ").append(String.format("%.2f", stats.getAverageGPA()));
        } else {
            sb.append("No students were managed in this session.");
        }
        
        JOptionPane.showMessageDialog(null,
            sb.toString(),
            "Session Summary",
            JOptionPane.INFORMATION_MESSAGE);
    }
}