package DSA.Strings;

public class Uppercase {
    public static StringBuilder toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ' && i < str.length() - 1) {
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(currentChar);
            }
        }
        return sb;
    }

    public static void main(String args[]) {
        String str = "hi i am abhishek!";
        System.out.println(toUpperCase(str));
    }
}
