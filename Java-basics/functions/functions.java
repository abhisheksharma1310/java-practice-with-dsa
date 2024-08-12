package functions;

import java.util.Scanner;

public class functions {
    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        sc.close();
    }

    public static void main(String args[]) {
        calculateSum();
    }
}
