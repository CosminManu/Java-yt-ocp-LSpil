package main;

public class Example2ocp {

    //var x; ERROR

    public static void main(String[] args){

        //instantiation
        int [] x;
        x = new int[5];
        // x = {2, 4, 5, 3}; ERR

        int [] y1 = {};       //declaration(..=) and assignment(=..) must be on same line if {}
                                    //length 0
        int [] y2 = {2, 4, 5, 3};   //length 4

        int [] q;
        q = new int[] { 1, 3};  // both type(int) & values(1, 3) => NO LENGTH ([2])

//==============================VAR===========

        var w = new int[10];    // VAR replaces the type of variable
//        var [] x;
//        var w2 = {};
//        var w2 = {1, 2, 3};      ERROR
        var w3 = new int[] {1, 2, 4};

        m(w);
        m(w3);
        m(q);
        m(new int[2]);
        m(new int[] {1, 2, 3, 4});

//        m(new int[]);  ERROR Array initializer expected
//        m(new int[4] {1, 2, 3, 4});

    }

    private static void m(int [] z){
    }

//    private static void n(var z){}
//    private static var n(int z){}     ERROR

}
