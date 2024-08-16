package DSA.Sorting;

public class BubbleSort {
    // Bubble sort
    // compare each elemnt and swap largest element at the end
    public static void sort(int arr[]) {
        // if array is allready sorted
        int swapCount = 0;
        // outer loop for turn: n-1
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // inner loop for
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // if current element is greter than next element then swap the current element
                // with its next element
                // if (arr[j] > arr[j + 1]) {
                // int temp = arr[j];
                // arr[j] = arr[j + 1];
                // arr[j + 1] = temp;

                // // increment swap counter
                // swapCount++;
                // }
                // sort descendig
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // increment swap counter
                    swapCount++;
                }
            }
            // if swap count is zero at this stage also it means array is allready sorted
            if (swapCount == 0) {
                System.out.println("Array is allready sorted.");
                return;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sort(arr);
        printArray(arr);
    }
}
