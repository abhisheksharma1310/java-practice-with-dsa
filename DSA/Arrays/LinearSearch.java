package DSA.Arrays;

public class LinearSearch {
    // Linear Search
    // find the index of element in a given array
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 6, 8, 10, 12, 21, 16 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.print("Key not found.");
        } else {
            System.out.print("Key found at index: " + index);
        }
    }

}
