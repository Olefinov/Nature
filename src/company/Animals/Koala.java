package company.Animals;

public class Koala extends Animal {
	public Koala(String color, String name, int age) {
		super(color, name, age);

	}

	@Override
	public void makeSound() {System.out.println("Nothing");}

	@Override
	public void food() {
		System.out.println("Leafs");
	}

	@Override
	public void running() {System.out.println("soo slow");}
}