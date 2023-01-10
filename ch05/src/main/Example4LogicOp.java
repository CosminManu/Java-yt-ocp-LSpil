package main;

public class Example4LogicOp {

    public static void main(String[] args) {
        // &&   &   ||  |   !

        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 && b2);

    }
}
