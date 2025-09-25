package models;

import java.util.HashMap;

public class StudentRepo implements Repo<Student> {
    private HashMap<String, Student> students;

    public StudentRepo() {
        this.students = new HashMap<>();
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(String id) {
        return students.get(id);
    }

    @Override
    public void delete(String id) {
        students.remove(id);
    }

    public void listAll() {
        System.out.println("All students:");
        for (Student student : students.values()) {
            System.out.println("- " + student);
        }
    }
}
