package DSA.Backtracking;

/*
 * total subset = 2^n
 * n = string length
 * time complexity: O(n*2^n)
 * space complexity: O(n)
 */

public class FindSubsets {
    public static void subsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            System.out.println(ans.length() == 0 ? null : ans);
            return;
        }
        // Yes choice
        subsets(str, ans + str.charAt(i), i + 1); // recursion
        // No choice
        subsets(str, ans, i + 1); // backtracking
    }

    public static void main(String args[]) {
        String str = "abc";
        subsets(str, "", 0);
    }
}