public class RemoveDuplicates {
    public static void remove(String str, int idx, StringBuilder newString, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            remove(str, idx + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            remove(str, idx + 1, newString.append(currChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "abbcccddeefgghii";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
