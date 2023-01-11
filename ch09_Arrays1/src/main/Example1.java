package main;

public class Example1 {
    public static void main(String[] args) {

        /**
         * Arrays are a collection of variables
         * of constant length and of same type
         * lastIndex = x.length - 1
         */
        int[] x;           // Array declaration
        x = new int[5];     // Array assignment (length MUST be provided)

        int[] y = new int[5];  //initialization

        x = new int[10];    //reassignment;
                            // by default -> 0 | 0 | 0 | .. | 0

        // x[10] -> ArrayIndexOutOfBounds
        // x[11] -> ArrayIndexOutOfBounds
        x[0] = 8;
        x[1] = 9;
        x[2] = 4;
        x[3] = 1;
        x[4] = 3;
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
