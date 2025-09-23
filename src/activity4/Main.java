package activity4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // ArrayList of type Animal
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());


        for (Animal a : animals) {
            a.makeSound();
        }

    }
}
