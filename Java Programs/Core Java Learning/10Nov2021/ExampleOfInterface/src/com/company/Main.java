package com.company;

public class Main implements ThisIsInterface {

    public static void main(String[] args) {
        Main object = new Main();
        object.display();
    }


    // This is implementation of the methods of interface.
    // We need to use all methods of interface once interface is implemented
    public void display() {
        System.out.println("Hello World");
    }

}
