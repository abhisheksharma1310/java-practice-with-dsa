package Oops;

/*
 * Encapsulation: Encapsulation is defined as the wrapping up of data & methods 
 * under a single unit. It also implements data hiding.
 */

public class OOPS {
    public static void main(String args[]) {
        // create a pen object called p1
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(1);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "abhishek";
        // myAcc.password = "abcdefghi"; // not possible to alter private properties
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pass) {
        password = pass;
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

}
