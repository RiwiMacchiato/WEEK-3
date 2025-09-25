import java.util.ArrayList;
import models.Animal;
import models.Cat;
import models.Dog;

public class main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal randomAnimal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Tom", 3, "small");
        Cat cat = new Cat("Sam", 2);
        
        animals.add(randomAnimal);
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}