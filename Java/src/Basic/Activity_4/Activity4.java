package javaBasic.Activity_4;

import java.util.ArrayList;

public class Activity4 {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        System.out.println("Sonidos de animales:");
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
