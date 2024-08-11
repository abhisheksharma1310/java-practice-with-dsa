package loops;

import java.util.Scanner;

public class continueQ1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enetr your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was: " + n);
        }
    }
}
