package main;

public class Example1 {

    public static void main(String[] args) {
        final int x;    //not assigned in memory yet

        x = 10;         // assigned in memory
        //x = 2;    //cannot reassign final variable

    }

    void m(final int x){

        //x = 10;   //cannot reassign final variable

    }
}
