package main;

public class Example2 {

    static public void main (String args[]) {

        final int[] x = {1, 2, 3, 4};     //x cannot be reassigned
        x[2] = 10;
//       x = new int[]{2, 45, 77};

        String[] y = {"A", "M", "MCM"};


        int[][] z = {{1, 2, 3}, {4, 10, 31, 24, 88}, {}, {8, 19}};     //matrix (array of arrays)

        // {... , null} => Dereference of 'z[i]' may produce 'NullPointerException'

        System.out.println("z length: " + z.length);
        for (int i = 0; i < z.length; i++) {
            System.out.println("Length of array z[" + i + "]: " + z[i].length);

            for (int u = 0; u < z[i].length; u++) {
                System.out.print(z[i][u] + " ");
            }
            System.out.println();
        }

    }
}
