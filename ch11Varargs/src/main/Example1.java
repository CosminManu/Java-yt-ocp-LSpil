package main;

public class Example1 {
    static public void main(String args[]) {
        m1();                              //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        m1(1);
        m1(10001, 2, 3, 4, 5, 6, 7, 8);
        m2("salut", 3, 7, 8, 9);

        //

        int[] a = {1, 2, 3, 4, 5};
        m1(a);      // <=> m1(1,2,3,4,5);

        //

        int [] b1 = {1,2,3};
        int [] b2 = {1,2,3};
        m3(b1,b2);
        //  <=>
        int[][] c = {b1,b2};    // c becomes a matrix
        m3(c);

    }

    /**
     * Varargs (type+...) = variable no of argum
     * u can provide as many parameters of same type as you want
     * as PARAMETERS varargs come ALWAYS at the end && no more than 1 varargs as param
     */

    static void m1(int... a) {
        int length = a.length;

        if (length > 0) {
            for (int j : a) {
                System.out.print(j + " ");
            }
            System.out.println();       //first value if any
        }
    }

    static void m2(String s, int... x) {
        System.out.println("String given is: " + s);
        System.out.println("Array given length is: " + x.length);
    }
//    static void m3(String... s, int... x){}   ERROR
//    static void m4(int... x, String s){}      ERROR
//    static void m5(int...[] x){}

    static void m3(int[]... x) {     // x -> array of arrays = matrix; int[]... <=> int[][]
        for (int[] a : x) {
            for (int b : a) {
                //
            }
        }
    }
}
