package DSA.BitManipulation;

public class IthBit {
    // get ith bit
    // left shit i
    // ex if i = 2
    // 1<<2
    // & with original number
    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i; // 00000001 << 3 = 00001000 = 8 = 1*2^3
        if ((n & bitMask) == 0) {
            // 1010 & 1000 = 1000 = 8
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    // set ith bit
    public static void setIthBit(int n, int i) {
        int bitMask = 1 << i;
        // 1010 | 0100 = 1110 = 14
        System.out.println(n | bitMask);
    }

    // clear ith bit
    public static void clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        // ~1000 = 0111
        // 1010 & 0111 = 0010 = 2
        System.out.println(n & bitMask);
    }

    // update bit
    public static void updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            clearIthBit(n, i);
        } else {
            setIthBit(n, i);
        }
    }

    // clear lasth i bits
    public static void clearLastIthBits(int n, int i) {
        // ex: n=1111, i=2, output = 1100
        // maskbit = -1<<2 = 11111100
        // let n = 1010
        // n & maskBit = 00001010 & 11111100 = 00001000 = 8
        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }

    // clear range of bits
    // n = 100111010011, i=2, j=7
    // a = (~0)<<(j+1) = 111100000000
    // b = 2^i -1 = 2^2-1 = 1<<i - 1 = 000000000011
    // bitmask = a|b = 111100000011
    // n & bitmask = 100100000011
    public static void clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        System.out.println(n & bitMask);
    }

    // power of 2 or not
    public static void isPowerOf2(int n) {
        // check if a number is power of 2 or not
        System.out.println((n & (n - 1)) == 0);
    }

    // count set bits in a number
    public static void countSetBits(int n) {
        // n = logn + 1
        // 16 = log16 + 1 = 4 + 1 = 5
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    // fast exponentiation
    public static void exponentiation(int number, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans *= number;
            }
            number *= number;
            power = power >> 1;
        }
        System.out.println(ans);
    }

    // swap number
    public static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);
    }

    // add 1 to a given number without using + operator
    public static void addOne(int n) {
        // -x = ~x + 1
        // -~x = x + 1
        System.out.println(-~n);
    }

    // convert uppercase character to lowercase using bitmanipulation
    public static void toLowercase() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }

    public static void main(String main[]) {
        // binary left shift a<<b = a*2^b
        // a = 00001010 = 10, then a<<2 = 10*2^2 = 40 = 00101000
        getIthBit(10, 3); // 1010, i=3, output = 1
        setIthBit(10, 2); // 1010, i=2, output = 1110 = 14
        clearIthBit(10, 3); // 1010, i=3, output = 0010 = 2
        updateIthBit(10, 3, 0); // 1010 & 0111 = 0010
        clearLastIthBits(10, 2); // 00001010 & 11111100 = 00001000 = 8
        clearBitsInRange(10, 2, 4); // 00001010, output = 00000010 = 2
        isPowerOf2(10); // 1010 & 1001 = 1001
        countSetBits(10); // 1010, output = 2
        exponentiation(3, 5);
        swap(3, 4);
        addOne(5);
        toLowercase();
    }
}
