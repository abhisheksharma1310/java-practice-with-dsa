package DSA.Recursion;

/*
 * You are given a number (eg-2019), convert it into a String of english
 * like "two zero one nine". Use a recursive function to solve this problem.
 * Note - the didgits or the number will only be in the range 0-9
 * and the last digit can't be 0.
 */

public class NumberToString {
    public static void printString(int number) {
        String numbers[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printString(number / 10);
        System.out.print(numbers[lastDigit] + " ");
    }

    public static void main(String args[]) {
        printString(1947);
    }
}
