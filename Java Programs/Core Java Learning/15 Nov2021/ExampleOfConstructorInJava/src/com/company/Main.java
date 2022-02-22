package com.company;

public class Main {

    int num;

    double num1;
    public Main(int num )
    {
        this.num = num;
    }

    public Main()
    {
        num = 10;
    }

    // Same as method overlaod there is Constructor overload which Constructor also has signature which is number of parameters and types of parameters passed into it

    public Main(double num1)
    {
        this.num1 = num1;
    }

    public Main(int num, double num1)
    {
        this.num = num;
        this.num1 = num1;
    }

    public static void main(String[] args) {

        //Constructors are invoked whenever the object of the class is created.
        // They are almost same as the methods except they dont have any return type and their name is same as the Class name
        // If and only if no constructor is defined than compiler provide default constructor with no parameters

        // This is how Constructors are invoked and used;
        Main object1 = new Main();
        System.out.println("This is no value Constructor value num is "+object1.num);

        Main object2 = new Main(20);
        System.out.println("This is parameterized Constructor value of num is "+object2.num);

        Main object3 = new Main(10.5);
        System.out.println("This is Parameterized Constructor value of num1 is "+object3.num1);

        Main object4 = new Main(10,10.5);
        System.out.println("This is Parameterized Constructor value of num is "+object4.num+ " and num1 value is "+object4.num1);

    }
}
