package com.company;

public class Main {

    // Class Members are either Class variabels or Class Methods which are defined with static modifier
    // Static modifier makes exactly and only one copy of the variable or method and class variable and class methods are belongs to Class itself rather than instances of class

    static int numbers;

    // we can also create constant with static and final modifier as below
    static final int num = 10;

    public static void display()
    {
        System.out.println("The number is - "+ Main.numbers);
    }

    // static can also have block which will run at that time when the class will be loaded in memory
    static {
        System.out.println("I am static block");
    }

    // We can also have multiple static blocks which will run in same order as they are written in code
    static {
        System.out.println("I am second static block");
    }
    public static void main(String[] args) {

        // TO access the Class variables and Class Methods We use Class name rather than the object name
        //As below
        Main.numbers = 100;
        Main.display();
        System.out.println("This is Constant - "+Main.num);
    }
}
