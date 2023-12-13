package Exercise2;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Adding different animals to the zoo
        Mammal lion = new Mammal("Lion", 5);
        Bird parrot = new Bird("Parrot", 2);
        Fish shark = new Fish("Shark", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(shark);

        // Showcasing behaviors
        zoo.showcaseBehaviors();
    }
}

