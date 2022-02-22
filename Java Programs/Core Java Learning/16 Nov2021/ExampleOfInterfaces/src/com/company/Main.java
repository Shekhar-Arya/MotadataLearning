package com.company;

import static com.company.otherfunction.display2;

public class Main implements functions, otherfunction{

    public static void main(String[] args) {

        Main objects = new Main();
        objects.print();
        objects.display();
        objects.display1();
        display2();
    }

    @Override
    public void print() {
        System.out.println("Hi from 1 interface method");
    }

    @Override
    public void display() {

        System.out.println("Hi from 2 interface method");
    }



}



// Interface is refrence type like class that can contain only constants, method signatures, default methods, static methods and nested methods
// Method body will only be provided in default methods and static methods
// They can only implemented
// An interface can extends other interfaces

interface functions extends function{
void print();
}

interface function{
    void display();
}

interface otherfunction{
    default void display1()
    {
        System.out.println("Hi from 3 interface method");
    }

    static void display2(){
        System.out.println("Hi from 3 interface 2 method");
    }
}

// In some cases we need to add the methods to the interface.
// if we add method directly to the interface then it will efect all the classes that implement this interface
// so eitehr we will create new interface with new methods signature that we need to add and then we will extends old interface to new one
// And any class need upgraded methods then they will use this uggraded new interface
// Secondly we can create default method in interface whic will help us to add new method in interface without effecting classes
// Cause class will not able change the implementation of default methods
// We can also add static methods in interface .