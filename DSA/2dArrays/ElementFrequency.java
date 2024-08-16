
public class ElementFrequency {
    // Print the number of 7's that are in the 2d array.
    public static void totalElements(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println("Total numbers of time " + key + " found: " + count);
    }

    public static void main(String args[]) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        totalElements(matrix, 7);
    }
}
