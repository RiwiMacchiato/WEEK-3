import models.Person;
import java.util.ArrayList;

public class main {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        Person person_1 = new Person("Juan", 30);
        Person person_2 = new Person("David", 17);
        Person person_3 = new Person("Ana", 28);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person_1);
        persons.add(person_2);
        persons.add(person_3);
        persons.add(new Person("Ana", 28));

        for (Person person : persons) {
            if (person.getAge() >= 18) {
                System.out.println(person.getName());
            }
        }
    }
}