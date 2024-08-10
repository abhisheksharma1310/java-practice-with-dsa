package conditionalStatements;

public class largestOf3Numbers {
    public static void main(String args[]) {
        // find largst of three number
        int a = 1, b = 3, c = 6;
        if (a > b) {
            if (a > c) {
                System.out.println("A is largest.");
            } else {
                System.out.println("C is largest.");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest.");
            } else {
                System.out.println("C is largest.");
            }
        }
    }

}
