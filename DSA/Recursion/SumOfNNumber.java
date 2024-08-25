package DSA.Recursion;

public class SumOfNNumber {
    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + printSum(n - 1);
    }

    public static void main(String args[]) {
        System.out.print(printSum(5));
    }
}
