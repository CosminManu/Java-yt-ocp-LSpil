package main;

public class Example2 {

    public static void main(String[] args){

        //final static int x = 29;      CAN'T HAVE STATIC LOCALLY

        Bottle dorna1 = new Bottle("Dorna mare", 1);
        Bottle dorna2 = new Bottle("Dorna mica", 0.75);
        Bottle borsec = new Bottle("Borsec", 0.5);

        //borsec.volume = 2;
        System.out.println(borsec);
        System.out.println(dorna2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1);
        System.out.println(dog1.name);
        System.out.println(dog2);
        System.out.println(dog2.name);
        System.out.println(dog3);
        System.out.println(dog3.name);
    }
}
