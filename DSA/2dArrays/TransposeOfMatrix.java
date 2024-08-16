
public class TransposeOfMatrix {
    // write a program to find transpose of a matrix
    public static int[][] transpose(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int transposeMatrix[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        printMatrix(transpose(matrix));
    }
}
