package main;

public class Foo {

    int x;
    static int y;   //STATIC variables ONLY inside a class
    static final int z = 555;

    //cannot initialize z through ctor, not related to instance (static)
    // => assignment directly with declaration
    //static final = final static

}
