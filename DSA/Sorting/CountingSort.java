package DSA.Sorting;

public class CountingSort {
    // Counting sort
    public static void sort(int arr[]) {
        // find largest in given array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // find frequency of elements in given array
        // store that frequency in count array
        // ex: arr[5] ={7,5,4,4,3,2,2,1}
        // count[] = new int[8];
        // count[] = {0,1,2,1,2,1,0,1}
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting ascending
        // int j = 0;
        // for (int i = 0; i < count.length; i++) {
        // while (count[i] > 0) {
        // arr[j] = i;
        // j++;
        // count[i]--;
        // }
        // }
        // sorting descending
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 7, 5, 4, 4, 3, 2, 2, 1 };
        sort(arr);
        printArray(arr);
    }
}
