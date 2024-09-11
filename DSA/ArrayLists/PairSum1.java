package DSA.ArrayLists;

import java.util.ArrayList;

/**
 * find if any pair in a sorted arrayList has a target sum
 */

public class PairSum1 {
    public static void findSum(ArrayList<Integer> list, int targetSum) {
        // // brute force - O(n)
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (targetSum == list.get(i) + list.get(j)) {
        // System.out.println(list.get(i) + " + " + list.get(j) + " = " + targetSum);
        // return;
        // }
        // }
        // }
        // System.out.println("pair not exist.");

        // pointer - O(n)
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == targetSum) {
                System.out.println(list.get(lp) + " + " + list.get(rp) + " = " + targetSum);
                return;
            } else if (list.get(lp) + list.get(rp) < targetSum) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println("pair not exist.");
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        findSum(list, 5);
    }

}
