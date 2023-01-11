package main;

public class AllCorectWaysToDeclareArrays {

    static public void main(String args[]){

        int[] x1;           //declaration
        x1 = new int[5];    //assignment

        int[] x2 = new int[5];  //initialization

        x2 = new int[10];       //reassignment

        int x3 [];       //c style declaration
//        x3 = new int[];       //length needed
//        x3 = {1, 2, 3};       // declaration (..=) & assignment (=..) on same line if { } used; no length when { } used;
        int x4 [] = {1, 2, 3};

        int[] y1 = {};
        int[] y2 = {2, 3, 4};
        int [] y;
        y = new int[]{1, 3, 5, 7, 9};       //no length provided here
        int[] y3 = new int[] {1, 2, 3};


        var v = new int[10];        //Var replaces the type of variable
//        var [] c;
//        var v2 = {};
//        var v2 = {1.5, 2.6, 3.7};
        var v3 = new float[] {1.5f, 2.6f, 3.7f};


        int[][] z = {{1,2,3}, {1,3}};
        int[][][] p = {{ {1,3}, {} }, { {1} }, {null}, null};

    }

//    private static void (var z){}
//    static private var (int i){}

}
