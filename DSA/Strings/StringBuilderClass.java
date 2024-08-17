package DSA.Strings;

public class StringBuilderClass {
    // optimized way to waork with string
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
