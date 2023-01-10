package main;

public class Example1 {

    public static void main(String[] args) {
        int i = 1, j = 1;

        A: while(i <= 3){   //labelling not used in real code

            B: while (j <= 3) {
                System.out.println(":)");
                if(j % 2 == 0) break B;     //break out of everything -> line 16
                j++;
            }
            i++;
        }
    }
}
