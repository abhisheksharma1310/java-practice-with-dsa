package DSA.Strings;

public class LargestString {
    // we can find largest string using string method compareTo
    // it give result by comparing two string laxicographically
    // 0 for equal, -v1 for s1 < s2, +ve for s1 > s2
    public static void main(String args[]) {
        // String str1 = "aabbccd";
        // String str2 = "aabbcce";
        // String str3 = "aabbcce";
        // System.out.println(str1.compareTo(str2));
        // System.out.println(str2.compareTo(str1));
        // System.out.println(str2.compareTo(str3));

        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest string is: " + largest);
    }
}
