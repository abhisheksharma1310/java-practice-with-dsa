package functions.questions;

import java.util.Scanner;

public class binaryToDecimal {
    public static int binToDecimal(int binNum) {
        int decNum = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        return decNum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binNum = sc.nextInt();
        System.out.println(binToDecimal(binNum));
        sc.close();
    }
}
