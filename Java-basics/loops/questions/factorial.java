package loops.questions;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        // Write a program to find the factorial of any number entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n == 0 || n == 1)
            System.out.println("Factorial of " + n + "is " + 1);
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        sc.close();
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
