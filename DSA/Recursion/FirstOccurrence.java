package DSA.Recursion;

/**
 * WAP to find occurence of an element in an array
 */

public class FirstOccurrence {
    public static boolean occurs(int arr[], int n, int key) {
        if (n == arr.length) {
            return false;
        }
        if (arr[n] == key) {
            return true;
        }
        return occurs(arr, n + 1, key);
    }

    public static void main(String args[]) {
        int arr[] = { 11, 23, 12, 34, 45 };
        System.out.print(occurs(arr, 0, 31));
    }
}
