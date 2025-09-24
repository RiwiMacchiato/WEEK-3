package spike.activity2;
import spike.activity1.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();

        Person person1 = new Person("Johan",20);
        Person person2 = new Person("Felipe",28);
        Person person3 = new Person("Andres",17);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for(Person person: people){
            if(person.getAge()>=18){
                System.out.println(person);
            }
        }
    }
}
