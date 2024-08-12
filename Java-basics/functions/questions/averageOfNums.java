package functions.questions;

import java.util.Scanner;

public class averageOfNums {
    // Write a Java method to compute the average of three numbers.
    public static float averageOf3Numbers(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Average = " + averageOf3Numbers(a, b, c));
        sc.close();
    }
}
