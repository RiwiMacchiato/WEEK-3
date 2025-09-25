import models.Person;

public class main {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        Person person_1 = new Person("Juan", 30);
        Person person_2 = new Person("David", 25);
        Person person_3 = new Person("Ana", 28);


        System.out.println(person_1.getName());
        System.out.println(person_2 .getName());
        System.out.println(person_3.getName());
    }
}