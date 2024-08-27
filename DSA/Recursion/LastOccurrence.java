package DSA.Recursion;

public class LastOccurrence {
    public static int occurrence(int arr[], int n, int key) {
        if (n == arr.length) {
            return -1;
        }

        int isFound = occurrence(arr, n + 1, key);
        if (isFound != -1) {
            return isFound;
        }

        // check with self
        if (arr[n] == key) {
            return n;
        }
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 45, 32, 34, 37, 76, 45 };
        System.out.print(occurrence(arr, 0, 45));
    }
}
