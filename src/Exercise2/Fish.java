package Exercise2;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes fish sound.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
