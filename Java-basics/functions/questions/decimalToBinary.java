package functions.questions;

import java.util.Scanner;

public class decimalToBinary {
    public static int decToBinary(int decNum) {
        int binNum = 0;
        int pow = 0;
        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum += remainder * Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }
        return binNum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.println(decToBinary(decimalNumber));
        sc.close();
    }
}
