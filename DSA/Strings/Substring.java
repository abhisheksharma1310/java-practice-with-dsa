package DSA.Strings;

public class Substring {
    public static void subString(String str, int start, int end) {
        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += str.charAt(i);
        }
        System.out.println(subStr);
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        subString(str, 0, 5);
    }
}
