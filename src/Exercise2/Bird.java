package Exercise2;

public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes bird sound.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}
