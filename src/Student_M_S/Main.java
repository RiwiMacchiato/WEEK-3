package Student_M_S;

public class Main {

    public static void main(String[] args) {

        Repository<Student> repository = new StudentRepository();

        //Save
        Student s1= new Student(1025, "Andres","Matematicas","2");
        Student s2= new Student(1035, "Felipe","Español","3");
        repository.save(s1);
        repository.save(s2);

        //SelectID
        Student found= (Student) repository.seachId("2");
        System.out.println("SELECT: " + found.getDescripcion());

        //ListALL
        System.out.println("LIST ALL: ");
        for (Student s : repository.findAll()){
            System.out.println(s.getDescripcion());
        }

        //Delete
        repository.delete("1");
        System.out.println("After DELETE");
        for (Student s : repository.findAll()) {
            System.out.println(s.getDescripcion());
        }


    }
}

