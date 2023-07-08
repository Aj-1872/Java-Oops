package Oops.Abstract;

abstract class Animal {

    abstract void walk();

    Animal() {
        System.out.println("Animal eats");
    }

    public void eat(String name) {
        System.out.println(name + "eating");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }

}

public class Abstract {
    public static void main(String[] args) {

        Horse horse = new Horse();
        // horse.walk();

        // horse.eat("horse");

        // Animal animal = new Animal();
        // animal.walk;
    }

}
