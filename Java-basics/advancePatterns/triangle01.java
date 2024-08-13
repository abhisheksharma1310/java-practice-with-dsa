
public class triangle01 {
    // 0 - 1 Triangle
    public static void triangle(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // ineer loop
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? 1 : 0);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        triangle(5);
    }
}
