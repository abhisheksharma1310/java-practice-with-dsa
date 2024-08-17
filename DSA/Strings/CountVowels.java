package DSA.Strings;

import java.util.Scanner;

public class CountVowels {
    // count how many times lowercase vowels occurred in a string entered by user
    public static void checkVowel(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total number of vowelS: " + count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        checkVowel(str);
        sc.close();
    }
}
