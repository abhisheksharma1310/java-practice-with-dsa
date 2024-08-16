import java.util.Scanner;

public class LargestSmallest {
    // find largest and smallest in a given matrix
    public static void FindLargestSmallest(int matrix[][]) {
        int n = matrix.length; // row
        int m = matrix[0].length; // col
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);
    }

    // take matrix from user
    public static void takeMatrix(int matrix[][]) {
        int n = matrix.length; // row
        int m = matrix[0].length; // col
        System.out.println("Enetr your matrix element: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter " + "[" + i + "]" + "[" + j + "] element: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    // output
    public static void printMatrix(int matrix[][]) {
        int n = matrix.length; // row
        int m = matrix[0].length; // col
        System.out.println("Entered matrix elements are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        takeMatrix(matrix);
        printMatrix(matrix);
        FindLargestSmallest(matrix);
    }
}
