package functions;

import java.util.Scanner;

public class functionParameters {
    public static void calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        calculateSum(a, b); // arguments or actual parameters
        sc.close();
    }
}
