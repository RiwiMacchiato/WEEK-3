package dia2.activity13;

public class Main {
    public static void main(String[] args) {
        
        StudentRepo repo = new StudentRepo();
        Student s1 = new Student("1", "Johan");
        Student s2 = new Student("2", "Andres");
        Student s3 = new Student("3", "Juan");

        repo.save(s1);
        repo.save(s2);
        repo.save(s3);

        System.out.println("Estudiante con ID 2: " + repo.findById("2").getName());

        repo.delete("1");
        
        System.out.println("\nTodos los estudiantes despues de eliminar el estudiante con id 1:\n");
        for(Student s : repo.findAll().values()){
            System.out.println("ID: " + s.getId() + ", Nombre: " + s.getName());
        }

    }
}
