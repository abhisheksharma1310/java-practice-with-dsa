package Oops;

/*
 * Polymorphism
 * - compile time polymorphism
 *  -- Method Overloading
 * Multiple functions with the same name but different parameters
 * - Run time polymorphism
 *  --Method Overriding
 * Parent and child classes both contain the same function with a different definition.
 */

public class Polymorphism {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 2.5f));
        System.out.println(calc.sum(1, 2, 3));

        Deer deer = new Deer();
        deer.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

class Calculator {
    // function overloading
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
