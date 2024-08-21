
package Oops;

/**
 * *
 * Constructor: is a special method which is invoked automatically at the
 * time of object creation.
 * - Constructors have the same name as class or structure.
 * - Constructors don't have a return type (Not even void).
 * - Constructors are only called once, at object creation.
 * - Memory allocation happens when constructor is called.
 * 
 * Types of Constructors
 * - Non-Parameterized
 * - Parameterized
 * - Copy Constructor
 */

public class Constructors {
    public static void main(String args[]) {
        Student s1 = new Student("Abhishek");
        System.out.println(s1.name);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.marks[1] = 76;
    }
}

class Student {
    String name;
    int roll;
    int marks[];
    float percentage;

    // Non-parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("Initialize student object instance.");
    }

    // parameterized constructor function
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    // copy constructor function
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // this.marks = s1.marks; // shallow
        // deep copy
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
