package DSA.Recursion;

/**
 * Write a program to find length of a String
 */

public class StringLength {
    public static void findLength(String str, int idx, int length) {
        if (idx == str.length()) {
            System.out.println(length);
            return;
        }
        if (str.charAt(idx) != ' ') {
            length++;
        }
        findLength(str, idx + 1, length);
    }

    public static void main(String args[]) {
        findLength("Abhishek", 0, 0);
    }
}
