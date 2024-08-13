
public class InvertedHalfPyramid {
    // Inverted & Rotated Half Pyramid
    public static void IRHPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            int space = n - i;
            for (int j = 1; j <= n; j++) {
                if (space > 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
                space--;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        IRHPyramid(4);
    }

}
