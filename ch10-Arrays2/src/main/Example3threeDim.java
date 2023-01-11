package main;

public class Example3threeDim {

    static public void main(String args[]){

        int [][][] threeDimension = {{ {1,2}, {} }, { {1} }, {null}, null};

        System.out.println("Full length: "+threeDimension.length);      //4
        System.out.println(threeDimension[0].length);   // { {1,2}, {} }
        System.out.println(threeDimension[1].length);   // { {1} }
        System.out.println(threeDimension[2].length);   // {null}

        //System.out.println(threeDimension[3].length);   // Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "threeDimension[3]" is null

    }
}
