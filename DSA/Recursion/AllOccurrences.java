package DSA.Recursion;

/*
 * For a given integer of size N. You have to find all the occurrences
 * (indices) of a given element (key) and print them. Use a recursive 
 * function to solve this problem.
 */

public class AllOccurrences {
    public static void occurrences(int arr[], int idx, int key) {
        // base case
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        occurrences(arr, idx + 1, key);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        occurrences(arr, 0, 2);
    }
}
