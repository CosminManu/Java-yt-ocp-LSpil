package main;

public class Example5StandardAND {
    public static void main(String[] args) {
        //   &    standard AND operator
        //executes both sides of operation
        //even though the result is known (i.e. F && ... -> F)
        //
        // not used in real apps (don't care if second part should or not be evaluated)
        //the only thing important is getting the result

        boolean b1 = true;
        boolean b2 = false;

        boolean res1 = b1 && m(1);  // => 1
        boolean res2 = b2 && m(2);  // F &&...= F so m(2) won't be executed
        boolean res3 = b1 & m(3);   // => 3
        boolean res4 = b2 & m(4);   // => 4 executes both sides

        System.out.println(res4);
    }

    static boolean m(int i){
        System.out.println(i);
        return true;
    }
}
