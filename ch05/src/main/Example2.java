package main;

public class Example2 {

    public static void main(String args[]){
        int i = 10;

//        while(i < 10){          // condition is false, instructions are not done
//            System.out.println(":)");
//        }

        //Method 1
        do{
            System.out.println(":)");   //instruction is done at least ONCE until the condition is false
        } while(i < 10);

        //Method 2
        do
            System.out.println(1);
            //System.out.println(1);        compile error
        while(i < 10);
    }

}
