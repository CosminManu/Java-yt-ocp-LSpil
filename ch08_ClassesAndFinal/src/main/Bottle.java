package main;

public class Bottle {

    final double volume;
    String name;

    public Bottle(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "Bottle "+ name +
                " has volume " + volume + "L.";
    }
}
