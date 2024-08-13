
public class PalindromicPattern {
    // Palindromic Pattern
    public static void Palindromic(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // palindromic descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // palindromic ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Palindromic(5);
    }
}
