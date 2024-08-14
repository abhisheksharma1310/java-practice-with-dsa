package DSA.Arrays;

public class BinarySearch {
    // Binary Search
    public static int search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == numbers[mid]) {
                return mid;
            } else if (key < numbers[mid]) {
                end = mid - 1;
            } else if (key > numbers[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 11, 22, 33, 44, 55, 66, 77 };
        int key = 66;
        System.out.println(search(numbers, key));
    }
}
