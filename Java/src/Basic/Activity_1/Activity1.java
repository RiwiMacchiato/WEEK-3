package javaBasic.Activity_1;

import java.util.ArrayList;

public class Activity1 {

    public static void main(String[] args) {

        //Actitivy 1
        Person p1 = new Person("Andres", 17);
        Person p2 = new Person("Barabon", 20);
        Person p3 = new Person("PoloPo", 25);

        System.out.println("Actividad 1");
        System.out.println("___________");
        System.out.println(p1.getName() + " "+ p1.getAge());
        System.out.println(p2.getName() + " "+ p2.getAge());
        System.out.println(p3.getName() + " "+ p3.getAge());
        System.out.println("___________");


        ArrayList<Person> person = new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);

        //Activity 2

        System.out.println("Activida 2");
        System.out.println("___________");

        for (Person p : person) {
            if (p.getAge() >= 18) {
                System.out.println(p.getName()+ " "+ p.getAge());
            }
        }



    }







}
