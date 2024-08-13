
public class SolidRhombus {
    public static void SolidRhombusPattern(int n) {
        // Solid Rhombus
        for (int i = 1; i <= n; i++) {
            // inner loop space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop for star
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        SolidRhombusPattern(5);
    }
}
