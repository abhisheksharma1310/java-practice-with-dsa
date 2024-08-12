package functions;

public class functionOverloading {
    // function overloading: same function name with different parameter length or
    // type. return type of function can be different
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        int sum = sum(2, 50);
        int sum2 = sum(2, 3, 4);
        float sum3 = sum(2.7f, 6.7f);
        System.out.println(sum + ", " + sum2 + ", " + sum3);
    }
}
