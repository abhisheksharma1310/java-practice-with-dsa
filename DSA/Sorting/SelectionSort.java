package DSA.Sorting;

public class SelectionSort {
    // Selection sort
    // pick the lowest and put it at the beginning
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                // if (arr[minPos] > arr[j]) {
                // minPos = j;
                // }
                // sort descending
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
