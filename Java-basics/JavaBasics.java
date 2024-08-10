
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        // System.out.println("1 2 3 4 5");
        // System.out.println("Hello!");

        // comments
        /*
         * multiline comments
         */

        // variables
        int a = 1;
        String s = "Abhishek";
        // output
        System.out.println(a);
        System.out.println(s);

        // Data types
        // primitive
        boolean d = true; // byte
        byte a1 = 23; // -128 to 127
        char c = 'A'; // 1 byte
        short b = 23; // 2 bytes
        int e = 212; // 4 bytes
        long f = 23456; // 8 bytes
        float g = 23.3f; // 4 bytes
        double h = 234.546; // 8 bytes

        // non primitive
        // String
        // Array
        // Class
        // Object
        // Interface

        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        // String stringInput = sc.next(); // only one word
        String stringInput = sc.nextLine(); // take whole line
        System.out.println(stringInput);

        // different input method
        // nextInt
        // nextByte
        // nextFloat
        // nextDouble
        // nextBoolean
        // nextShort
        // nextLong

        // implicite (widening) type conversion
        int x1 = 34;
        long x2 = x1; // conversion possible

        long y1 = 32593256;
        // int y2 = y1; //not possible

        char ws = 'a';
        int wsq = ws; // possible

        // byte-> short-> int-> float-> long-> double

        // explicite type casting
        int marks = (int) 99.99f;

        // type promotion in expression
        // each byte, short or char is converted to int
        // if one operand is long, float, or double then whole expression is promoted to
        // long, float, or double
        char a2 = 'a';
        char a3 = 'b';
        System.out.println(a3 - a2);
    }
}