package functions.questions;

import java.util.Scanner;

public class palindrome {
    // Write a Java program to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int revNumber = 0;
        int num = n;
        while (n > 0) {
            int lastDigit = n % 10;
            revNumber = (revNumber * 10) + lastDigit;
            n /= 10;
        }
        return num == revNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
        sc.close();
    }
}
