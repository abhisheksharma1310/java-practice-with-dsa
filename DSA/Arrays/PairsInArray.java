package DSA.Arrays;

public class PairsInArray {
    // Pairs in an array
    public static void printPairs(int numbers[]) {
        int pairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + pairs);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }
}
