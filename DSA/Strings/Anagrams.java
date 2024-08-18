package DSA.Strings;

import java.util.Arrays;

/**
 * Anagrams
 */
public class Anagrams {
    // if two strings contain the same characters but in a different order,
    // they can be said to be anagrams.
    public static void isAnagram(String str1, String str2) {
        // convert string to lowercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // first check if string length are same
        if (str1.length() == str2.length()) {
            // convert strings into char array
            char str1CharArray[] = str1.toCharArray();
            char str2CharArray[] = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // if sorted array are same then strings are anagram
            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are  not anagrams of each other.");
            }
        } else {
            // string length are not same
            System.out.println("Strings are not anagram.");
        }
    }

    public static void main(String args[]) {
        String str1 = "earth";
        String str2 = "heart";
        isAnagram(str1, str2);
    }

}