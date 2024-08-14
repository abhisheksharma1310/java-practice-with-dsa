package DSA.Arrays;

public class ReverseArray {
    // Reverse an array
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap farst and last element
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            // increment first and decrement last
            first++;
            last--;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);
        printArray(numbers);
    }
}
