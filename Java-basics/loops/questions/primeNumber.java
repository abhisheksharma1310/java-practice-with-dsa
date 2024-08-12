package loops.questions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (n == 2)
            System.out.println("number is prime.");

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("number is not a prime number.");
                return;
            }
        }
        System.out.println("number is prime.");
    }

}
