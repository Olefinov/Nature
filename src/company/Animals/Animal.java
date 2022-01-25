package company.Animals;

public abstract class Animal {
	String color;
	String name;
	int age;

	public Animal(String color, String name, int age) {
		this.color = color;
		this.name = name;
		this.age = age;

	}

	public abstract void makeSound();

	public abstract void food();

	public abstract void running();

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Animal animal = (Animal) o;

		if (color != animal.color) {
			return false;
		}
		if (name != null ? !name.equals(animal.name) : animal.name != null) {
			return false;
		}
		return true;
	}
}



