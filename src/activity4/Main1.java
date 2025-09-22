import activity4.Animal;
import activity4.Cat;
import activity4.Dog;

import java.util.ArrayList;

public class Main1 {

} public static void main(String[] args) {


    // ArrayList of type Animal
    ArrayList<Animal> animals = new ArrayList<>();

    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Dog()); // can add more


    for (Animal a : animals) {
        a.makeSound();
    }

}

