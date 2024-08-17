package DSA.Strings;

import java.util.Scanner;

public class Palindrome {
    // palindrome
    public static void isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println(str + " is not palindrome.");
                return;
            }
        }
        System.out.println(str + " is palindrome.");
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.next();
        isPalindrome(str);
        sc.close();
    }
}
