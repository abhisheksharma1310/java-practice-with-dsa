package DSA.Backtracking;

/**
 * total number of permutation on n number = n!
 * time complexity: O(n*n!)
 */

public class Permutations {
    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(NewStr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutations(str, "");
    }
}
