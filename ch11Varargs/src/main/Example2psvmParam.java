package main;

public class Example2psvmParam {

    public static void main(String... anyName) {
        //anyName is NEVER null
        //most cases it is an empty array = length 0
        //contains only the values you provide at call, not the name of the method
        //Right to the hammer -> Edit Config -> Param variab

        System.out.println(anyName.length);

        for(String p: anyName){
            System.out.print(p + " ");
        }
    }

//    public static void Main(String[] args){}      ERR
//    static public int main(String args[]){}       ERR
//    public void main(String[] a){}                ERR



}
