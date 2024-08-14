package DSA.Arrays;

public class LargestNumber {
    // find largest number in a given array
    public static int largest(int numbers[]) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }

    public static void main(String args[]) {
        int numbers[] = { 11, 23, 45, 13, 56, 34, 87, 58, 7 };

        System.out.print(largest(numbers));
    }
}
