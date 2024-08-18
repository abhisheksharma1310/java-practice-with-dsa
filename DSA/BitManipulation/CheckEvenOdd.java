package DSA.BitManipulation;

import java.util.Scanner;

public class CheckEvenOdd {
    // check if a number is even or odd
    public static void check(int number) {
        int bitMask = 1;
        if ((number & bitMask) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        check(number);
        sc.close();
    }
}
