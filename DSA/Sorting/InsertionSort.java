package DSA.Sorting;

public class InsertionSort {
    // Insertion sort
    // pick and insert
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            // while (prev >= 0 && arr[prev] > curr) {
            // arr[prev + 1] = arr[prev];
            // prev--;
            // }
            // sorting descending
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 4, 2, 1 };
        sort(arr);
        printArray(arr);
    }
}
