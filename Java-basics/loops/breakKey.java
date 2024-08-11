package loops;

public class breakKey {
    public static void main(String args[]) {
        int counter = 1;
        do {
            System.out.println(counter);
            if (counter == 5)
                break;
            counter++;
        } while (counter <= 10);
    }
}
