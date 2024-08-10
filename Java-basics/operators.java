
public class operators {
    public static void main(String args[]) {

        // types of operators in java
        // Airthmatic Operators (Binary/Unary)
        // Binary operators: 2 operands
        // +, -, *, /, %
        int a = 10;
        int b = 5;
        System.out.println("Add = " + (a + b));
        System.out.println("Subtract = " + (a - b));
        System.out.println("Mutiply = " + (a * b));
        System.out.println("Divide = " + (a / b));
        System.out.println("Remainder = " + (a % b));
        // Unary operators
        // ++, --
        System.out.println("Increment = " + (++a));
        System.out.println("Decrement = " + (--b));

        // Relational Operators
        // ==, !=, >, <, >=, <=
        System.out.println("Equal = " + (a == b));
        System.out.println("Not Equal = " + (a != b));
        System.out.println("Greater than = " + (a > b));
        System.out.println("Less than = " + (a < b));
        System.out.println("Greater equal = " + (a >= b));
        System.out.println("Less equal = " + (a <= b));

        // Logical operators
        // &&, ||, !
        System.out.println("Logical AND = " + (true && false));
        System.out.println("Logical OR = " + ((5 < 1) || (2 < 7)));
        System.out.println("Logical NOT = " + (!(5 > 2)));

        // Bitwise Operators
        System.out.println("Bitwise AND = " + (true & false));
        System.out.println("Bitwise OR = " + ((5 < 1) | (2 < 7)));
        System.out.println("Bitwise NOT = " + (!(5 > 2)));
        System.out.println("Bitwise XOR = " + (5 ^ 2));

        // Assignment Operators
        int c = a;
        c += a;
        c -= a;
        c *= a;
        c /= a;
        c %= a;
        System.out.println(c);

    }
}
