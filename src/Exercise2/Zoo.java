package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showcaseBehaviors() {
        for (Animal animal : animals) {
            System.out.println(animal.name + ":");
            animal.makeSound();
            animal.eat();
            animal.sleep();
            // Additional behaviors based on types
            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }

            System.out.println(); // Adding a newline for clarity
        }
    }
}