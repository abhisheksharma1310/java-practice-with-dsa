package Oops;

/*
 * All methods are public, abstract & without implementation
 * Used to achieve total abstraction
 * Variables in the interface are final, public and static
 */

public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right diagonal");
    }
}