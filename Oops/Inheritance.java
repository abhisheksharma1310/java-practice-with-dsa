package Oops;

/**
 * Inheritance is when properties & methods of base class are passed on
 * to a derived class.
 * 
 * Types of Inheritance
 * - Sigle Level Inheritance
 * ex: base class => Derived class
 * - Multilevel inheritance
 * ex: base class => derived class => derived class
 * - Hierarchial Inheritance
 * ex: base class
 * => Derived Class
 * => Derived Class
 * - Hybrid Inheritance
 * => Derived Class => Derived Class
 * => Derived Class
 * - Multiple Inheritance
 * Base class => Derived Class <= Base Class
 */

public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breaths");
    }
}

// derived class
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("Walks");
    }
}

// derived class
class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

// derived class
class Dog extends Mammal {
    String breed;
}

// derived class or sub class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swim in water");
    }
}
