package main;

public class Example3 {

    static public void main(String args[]){     // <=> String... args (varargs)
        int[] x1;
        int x2[];   //c style

        int[] z1, z2;   //both are ref of type array
        z1 = new int[2];
        z2 = new int[3];

        int w1[], r;    // w1 -> array, r -> primitive
        w1 = new int[3];    //int[]
        r = 2;              //int

        int [] a1[], a2;    // a1&a2 will inherit int[] from datatype, and a1 -> int[][]
        a1 = new int[2][3];
        a2 = new int[10];

        int [] array[];
        int array2[][];     // same format
    }
}
