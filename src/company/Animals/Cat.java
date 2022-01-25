package company.Animals;

public class Cat extends Animal {

	public Cat(String color, String name, int age) {
		super(color, name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Myrrr-may");
	}

	@Override
	public void food() {
		System.out.println("Meat");
	}

	@Override
	public void running() {
		System.out.println("fast");
	}
}

