package Spike.activity1;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {


    public static void main(String[] args) {


        Person p = new Person("Andres", 29);

        Person p2 = new Person("Johan R", 23);

        Person p3 = new Person("Sepulveda", 20);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);


        ArrayList<Person> person1 = new ArrayList<>();
        person1.add(new Person("Andres", 26));
        person1.add(new Person("Johan", 15));
        person1.add(new Person("Felipe", 39));


        }
    }

