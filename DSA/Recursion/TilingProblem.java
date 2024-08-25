public class TilingProblem {
    public static int tiles(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tiles(n - 1);
        // horizontal choice
        int fnm2 = tiles(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String args[]) {
        System.out.print(tiles(4));
    }
}
