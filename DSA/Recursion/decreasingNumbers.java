package DSA.Recursion;

/*
 * Print numbers from n to 1 (Decreasing Order)
 */

public class decreasingNumbers {

    public static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String args[]) {
        printDec(10);
    }
}
