package loops.questions;

public class patterns {
    public static void main(String args[]) {
        // print this pattern
        // ⭐⭐⭐⭐
        // ⭐⭐⭐⭐
        // ⭐⭐⭐⭐
        // ⭐⭐⭐⭐
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }

        // print this pattern
        // ⭐
        // ⭐ ⭐
        // ⭐ ⭐ ⭐
        // ⭐ ⭐ ⭐ ⭐
        System.out.println("------------------------------");
        for (int line = 1; line <= 4; line++) {
            // System.out.println("*".repeat(i));
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // print this pattern
        // ⭐ ⭐ ⭐ ⭐
        // ⭐ ⭐ ⭐
        // ⭐ ⭐
        // ⭐
        System.out.println("------------------------------");
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= 4 - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // print this pattern
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        System.out.println("------------------------------");
        for (int line = 1; line <= 4; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i);
            }
            System.out.println("");
        }

        // print this pattern
        // A
        // B C
        // D E F
        // G H I J
        System.out.println("------------------------------");
        int n = 65;
        for (int line = 1; line <= 4; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print((char) n);
                n++;
            }
            System.out.println("");
        }
    }
}
