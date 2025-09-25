package src.repository;

import java.util.ArrayList;
import src.models.Student;

public interface StudentRepository {
    
    /**
     * Save a student to the repository (INSERT operation)
     * @param student Student to save
     * @return true if saved successfully, false otherwise
     */
    boolean save(Student student);
    
    /**
     * Find a student by ID (SELECT operation)
     * @param id Student ID to search for
     * @return Student if found, null otherwise
     */
    Student findById(String id);
    
    /**
     * Delete a student by ID (DELETE operation)
     * @param id Student ID to delete
     * @return true if deleted successfully, false otherwise
     */
    boolean deleteById(String id);
    
    /**
     * Get all students (SELECT ALL operation)
     * @return ArrayList containing all students
     */
    ArrayList<Student> findAll();
    
    /**
     * Check if repository is empty
     * @return true if empty, false otherwise
     */
    boolean isEmpty();
    
    /**
     * Get total number of students
     * @return count of students
     */
    int getCount();
}