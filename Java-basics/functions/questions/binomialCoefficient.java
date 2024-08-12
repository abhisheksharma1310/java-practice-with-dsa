package functions.questions;

import java.util.Scanner;

public class binomialCoefficient {
    public static int factorial(int n) {
        // Write a program to find the factorial of any number entered by the user.
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binomial coefficient n: ");
        int n = sc.nextInt();
        System.out.println("Enter binomial coefficient r: ");
        int r = sc.nextInt();

        int nf = factorial(n); // n!
        int rf = factorial(r); // r!
        int nmrf = factorial(n - r); // n-r!
        double ncr = nf / (rf * nmrf);
        System.out.println("Binomial coefficient is: " + ncr);
        sc.close();
    }
}
