package Oops;

/*
 * Hiding all the unnecessary details and showing only the important parts to the user.
 * It is implemented using abstract classes and interfaces
 * - Abstract Class
 * Cannot create an instance of abstract class
 * Can have abstraction-abstract methods
 * Can have constructors
 */

public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}