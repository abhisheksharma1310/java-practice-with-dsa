import java.util.Scanner;

public class Matrix {
    // 2-d array matrix
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // row
        int m = matrix[0].length; // col

        // input
        System.out.println("Enetr your matrix element: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter " + "[" + i + "]" + "[" + j + "] element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Entered matrix elements are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // find
        while (true) {
            System.out.println("Enter 1 to search or eneter 2 for exit: ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("Enter element to search: ");
                int key = sc.nextInt();
                find(matrix, key);
            } else {
                sc.close();
                return;
            }
        }
    }

    // find element in a matrix
    public static boolean find(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at: " + "[" + i + "]" + "[" + j + "]");
                    return true;
                }
            }
        }
        System.out.println("Element not found.");
        return false;
    }
}
