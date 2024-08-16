
public class SortedSearch {
    // search element in a sorted matrix
    public static void staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1; // top right cell
        // return from loop when reach to bottom left
        // time complexity o(n+m)
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at [" + row + "][" + col + "]");
                return;
            } else if (key < matrix[row][col]) {
                // if key less than current cell then move left
                col--;
            } else {
                // if key greater then current cell then move to bottom
                row++;
            }
        }
        System.out.println("Key not found.");
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        staircaseSearch(matrix, 14);
    }
}
