package DSA.Strings;

import java.util.Scanner;

public class Strings {

    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());

        // concatenation
        String firstName = "Abhishek";
        String lastName = "Sharma";
        String fullName = firstName + lastName;

        // char at index
        System.out.println(fullName.charAt(0));

        // string compare
        String s1 = "abh";
        String s2 = "abh";
        String s3 = new String("abh");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
