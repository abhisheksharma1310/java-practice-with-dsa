
public class Sumof2ndRow {
    // Print out the sum of the numbers in the second row of the given array
    public static void sum(int matrix[][]) {
        int sum = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            sum += matrix[1][col]; // row = 1 for second row
        }
        System.out.println("Total sum of second row: " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sum(matrix);
    }
}
