package loops.questions;

import java.util.Scanner;

public class breakQ1 {
    public static void main(String args[]) {
        // Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number multiple of 10: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Yes, Entered number is multiple of 10.");
                break;
            } else {
                System.out.println("Try agian.");
            }
        }
        sc.close();
    }
}
