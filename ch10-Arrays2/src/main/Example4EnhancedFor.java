package main;

public class Example4EnhancedFor {

    static public void main(String... args){

        int [][] a = { {14}, {33, 45}, {1,3,5} };       //assign at declaration
        int [][] array1 = new int[3][2];                 //{ {0,0}, {0,0}, {0,0} }

        int [][] array2 = new int[3][];
        array2[1] = new int[]{1};
        array2[2] = new int[]{44,34,67};
        array2[3] = new int[]{10, 12};


        /**
         * Enhanced for
         * Right side : collection that we are parsing
         * Left side : variable of the type of the VALUES INSIDE that collection
         */

        for(int[] x : a) {       //what contains a? arrays of int => x
            System.out.println(x.length);
            for(int y : x) {    //what contains x? ints => y
                System.out.print(y +" ");
            }
            System.out.println();
        }
    }
}
