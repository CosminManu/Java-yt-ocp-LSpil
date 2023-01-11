package main;

public class Example1 {

    static public void main(String[] args) {
        var x = new int[]{1, 3, 5, 6};

        for(int a : x){      // declaration variab : collection type; will execute the block of instruct after each value taken from the collection
//            a = 10;         // rewriting values
            System.out.println(a);

        }
    }

}
