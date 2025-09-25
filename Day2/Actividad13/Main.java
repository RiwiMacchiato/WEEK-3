import models.Student;
import models.StudentRepo;

public class Main {

    public static void main(String[] args) throws Exception {
        StudentRepo repo = new StudentRepo();

        // Save 3 students
        repo.save(new Student("001", "Alice Johnson"));
        repo.save(new Student("002", "Bob Smith"));
        repo.save(new Student("003", "Carol Davis"));

        System.out.println("After adding 3 students:");
        repo.listAll();

        // Find student by id
        System.out.println("\nFinding student with id '002':");
        Student found = repo.findById("002");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Student not found");
        }

        // Delete a student
        System.out.println("\nDeleting student with id '001':");
        repo.delete("001");

        System.out.println("\nRemaining students:");
        repo.listAll();
    }
}
