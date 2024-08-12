package loops.questions;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String args[]) {
        // find of sum number
        int i = 1, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum: " + sum);
    }
}
