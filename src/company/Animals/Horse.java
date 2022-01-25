package company.Animals;

public class Horse extends Animal {
    public Horse(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    public void makeSound() { System.out.println("Ihoho");}
    @Override
    public void food() {
        System.out.println("Grain");
    }

    @Override
    public void running() {
        System.out.println("too fast");
    }
}
