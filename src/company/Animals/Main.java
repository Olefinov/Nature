package company.Animals;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("white","kitty",3);
        Horse horse = new Horse("brown", "pony", 5);
        Koala koala = new Koala("grey", "green bear", 10);

        cat.getColor();
        cat.getName();
        cat.getAge();
        System.out.println("Cat colour: " + cat.getColor());
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat Age: " + cat.getAge());
        System.out.println("Cat is koala: " + cat.equals(horse));
        System.out.println("");
        System.out.println("What does the Cat say?");
        cat.makeSound();
        System.out.println("What do you want?");
        cat.food();
        System.out.println("How fast ?");
        cat.running();
        System.out.println("");

        cat.equals(horse);


        horse.getColor();
        horse.getName();
        horse.getAge();
        System.out.println("Horse colour: " + horse.getColor());
        System.out.println("Horse name: " + horse.getName());
        System.out.println("Horse Age: " + horse.getAge());
        System.out.println("Horse is cat: " + horse.equals(koala));
        System.out.println("");
        System.out.println("What does the Horse say?");
        horse.makeSound();
        System.out.println("What do you want?");
        horse.food();
        System.out.println("How fast ?");
        horse.running();
        System.out.println("");

        koala.getColor();
        koala.getName();
        koala.getAge();
        System.out.println("Koala colour: " + koala.getColor());
        System.out.println("Koala name: " + koala.getName());
        System.out.println("Koala Age: " + koala.getAge());
        System.out.println("Koala is koala: " + koala.equals(horse));
        System.out.println("");
        System.out.println("What does the Koala say?");
        koala.makeSound();
        System.out.println("What do you want?");
        koala.food();
        System.out.println("How fast ?");
        koala.running();
        System.out.println("");
    }
}
