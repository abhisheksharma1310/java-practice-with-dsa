package DSA.Recursion;

/*
 * You are given a number (eg-2019), convert it into a String of english
 * like "two zero one nine". Use a recursive function to solve this problem.
 * Note - the didgits or the number will only be in the range 0-9
 * and the last digit can't be 0.
 */

public class NumberToString {
    public static void printString(int num) {
        String numbers[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        int currentNumber = num % 10;
        System.out.print(numbers[currentNumber] + " ");
        num = num / 10;
        printString(num);
    }

    public static void main(String args[]) {
        printString(2019);
    }
}
