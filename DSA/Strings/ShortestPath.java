package DSA.Strings;

import java.util.Scanner;

public class ShortestPath {
    // find shortest path of given string
    public static void path(String str) {
        int x = 0, y = 0;
        double total = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                default:
                    break;
            }
        }

        // total path
        total = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Shortest distance: " + total);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        path(str);
        sc.close();
    }
}
