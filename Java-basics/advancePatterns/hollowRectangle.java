public class hollowRectangle {
    public static void hollow_Rectangle(int totalRows, int totalColumns) {
        // outer loop
        for (int i = 1; i <= totalRows; i++) {
            // inner columns
            for (int j = 1; j <= totalColumns; j++) {
                // cell - (i,j)
                if (i == 1 || i == totalRows || j == 1 || j == totalColumns) {
                    // boundary cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // print 4*4 hollow rectangle
        hollow_Rectangle(4, 5);
    }
}