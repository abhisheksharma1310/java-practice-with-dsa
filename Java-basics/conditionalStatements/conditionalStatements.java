package conditionalStatements;

public class conditionalStatements {
    public static void main(String args[]) {
        // if else statements
        int age = 19;
        if (age > 18) {
            System.out.println("You are adult.");
        } else {
            System.out.println("You are teenager");
        }

        // else if statements
        if (age > 18) {
            System.out.println("You are adult.");
        } else if (age >= 13 && age <= 18) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are child.");
        }

        // ternary operator
        String type = (5 % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        // switch statement
        int variable = 3;
        switch (variable) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("We wake up");
                break;
        }

    }
}
