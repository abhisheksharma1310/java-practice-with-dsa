package DSA.Arrays;

public class maxMinSubArraySum {
    // find sum of all sub array of a given array also find min and max
    public static void subArray(int numbers[]) {
        int subArray = 0;
        int n = numbers.length;
        int size = n * (n + 1) / 2;
        int sumSubArray[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " "); // subarray
                }
                sumSubArray[subArray] = sum;
                System.out.print("- Sum: " + sumSubArray[subArray]);
                subArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub array: " + subArray);
        maxMin(sumSubArray);
    }

    public static void maxMin(int sumSubArray[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        // largest value
        for (int i = 0; i < sumSubArray.length; i++) {
            if (sumSubArray[i] > largest) {
                largest = sumSubArray[i];
            }
        }
        // smallest value
        for (int i = 0; i < sumSubArray.length; i++) {
            if (sumSubArray[i] < smallest) {
                smallest = sumSubArray[i];
            }
        }
        // print
        System.out.println("Max sum of sub array is: " + largest);
        System.out.println("Min sum of sub array is: " + smallest);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArray(numbers);
    }
}
