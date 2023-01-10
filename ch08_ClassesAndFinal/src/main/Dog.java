package main;

public class Dog {

    final String name = "Bob";      //'name' will exist once it creates an instance of Dog

    //this is not the logic of an attribute anymore
    //in this case every instance of Dog will have same name 'Bob'
    //and it cannot be changed (final)
}