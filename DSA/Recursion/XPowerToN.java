package DSA.Recursion;

public class XPowerToN {
    public static int power(int x, int n) {
        // if (n == 0) {
        // return 1;
        // }
        // return x * power(x, n - 1);

        // optimized
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        System.out.print(power(2, 3));
    }
}
