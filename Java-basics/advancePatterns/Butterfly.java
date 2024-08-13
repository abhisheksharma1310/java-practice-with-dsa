
public class Butterfly {
    // Butterfly Pattern
    public static void ButterflyPattern(int n) {
        // outer loop for upper half
        for (int i = 1; i <= n; i++) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // inner loop for space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            // print new line
            System.out.println("");
        }
        // outer loop for lower half
        for (int i = n; i >= 1; i--) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // inner loop for space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            // print new line
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        ButterflyPattern(4);
    }
}
