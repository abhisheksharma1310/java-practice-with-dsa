package loops.questions;

import java.util.Scanner;

public class table {
    public static void main(String argfs[]) {
        // Write a program to print the multiplication table of a number N, entered by
        // the user.
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter a number to generate its table: "));
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
