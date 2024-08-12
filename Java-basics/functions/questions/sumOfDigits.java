package functions.questions;

import java.util.Scanner;

public class sumOfDigits {
    public static int sumOfInt(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits = " + sumOfInt(n));
        sc.close();
    }
}
