package loops;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String args[]) {
        // Reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // while (n > 0) {
        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10;
        // }

        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(reverse);
    }
}
