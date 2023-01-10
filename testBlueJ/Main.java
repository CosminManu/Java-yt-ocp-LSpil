
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
           /*
     * primitives - numbers, characters, boolean (true/false)
     * references - object
     */
        byte b1;    // 8-bit -> 2^8=256 values (-128 .. 127)
        // System.out.println(b1);  -- compile error (not initialised)
        
        b1 = 10;
        System.out.println(b1);
        
        short s1;
        int i1;     //32-bit = 4bytes
        long l1;    //64-bit
        
        l1 = 100000000000000000L;
    }
}
