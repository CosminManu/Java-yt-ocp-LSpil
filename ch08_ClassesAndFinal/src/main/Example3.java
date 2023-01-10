package main;

public class Example3 {
    public static void main(String[] args) {

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        f1.x = 10;      // attribute belongs to the instance
        f2.x = 100;

        System.out.println(f1.x);
        System.out.println(f2.x);

        Foo.y = 99;        // 'y' belongs to the class
        f2.y = 29999;      // Static member 'main.Foo.y' accessed via instance reference (not in practice)
        System.out.println(Foo.y);
        System.out.println(f2.y);       // last value provided

        System.out.println(Foo.z);

    }
}
