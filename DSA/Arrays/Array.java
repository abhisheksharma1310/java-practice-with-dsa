package DSA.Arrays;

public class Array {
    public static void main(String args[]) {
        // Array
        // dataType arrayName[] = new dataType[size]
        int numbers[] = new int[50];

        // alternate way
        int marks[] = { 97, 98, 99 };

        // pass array as argument (pass by reference)
        updateMarks(marks);
        printMarks(marks);
    }

    // update marks
    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    // print marks
    public static void printMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
