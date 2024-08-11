package loops;

public class continueKey {
    public static void main(String args[]) {
        int counter = 0;
        while (counter < 10) {
            counter++;
            if (counter == 5)
                continue;
            System.out.println(counter);
        }
    }
}
