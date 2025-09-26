//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Crud repo = new InMemoryStudentRepository();

    //Agregar estudiantes

    repo.crete(new Student("Andres","01","Programacion"));
    repo.crete(new Student("Carlos","02","Filosofia"));
    repo.crete(new Student("Mario","03","ciencias"));
    System.out.println("___________________________");

    //Buscar por ID


    System.out.println("Buscar por Id");
    System.out.println("___________________________");
    System.out.println(repo.findId("01"));
    System.out.println("___________________________");


    //Listar todos los Estudiantes
    System.out.println("Lista de Estudiantes");
    System.out.println("___________________________");
    for (Student s: repo.showAll()){
        System.out.println(s.getId()+" "+s.getName()+" "+s.getArea());
    }
    System.out.println("___________________________");

    //Elininar por Id Studiante(02)

    repo.delete("02");

    System.out.println("Lista de Estudiantes");
    System.out.println("___________________________");
    for (Student s: repo.showAll()){
        System.out.println(s.getId()+" "+s.getName()+" "+s.getArea());
    }


    }

