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

    public static void main(String main[]) {
        // binary left shift a<<b = a*2^b
        // a = 00001010 = 10, then a<<2 = 10*2^2 = 40 = 00101000
        getIthBit(10, 3); // 1010, i=3, output = 1
        setIthBit(10, 2); // 1010, i=2, output = 1110 = 14
        clearIthBit(10, 3); // 1010, i=3, output = 0010 = 2
        updateIthBit(10, 3, 0); // 1010 & 0111 = 0010
        clearLastIthBits(10, 2); // 00001010 & 11111100 = 00001000 = 8
    }
}
