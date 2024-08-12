package loops.questions;

import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String args[]) {
        // Write a program that reads a set of integers, and then prints the sum of the
        // even and odd integers.
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        boolean newInput = true;
        do {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
            System.out.println("To enter new number press 1 and for exit press 2.");
            int input = sc.nextInt();
            newInput = input == 1 ? true : false;
        } while (newInput);
        sc.close();
        System.out.println("Sum of even number is: " + even + ".");
        System.out.println("Sum of odd number is: " + odd + ".");
    }
}