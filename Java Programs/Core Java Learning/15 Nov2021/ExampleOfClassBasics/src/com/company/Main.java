package com.company;


// Class can be declared using class keyword and we can use Access modifier with it to provide acess level to the class and its memeber
//Class name should start with Capital letter
// If Class is Inheriting other class then it should be provided wwith extends keyword
// If class is Impelementing other interfaces than interfaces name should be provided with coma and preceded by implements keyword
// Class body is surrounded by { }
public class Main {

    // Declaring variables in class
    // Variables are declared with access modifier to provide access to only certain class and with varible type and variable name
    // These variables is also known as fields
    public int numbers;

    // Defing methods in class
    // Methods will also have access modifier
    // and return type if none then void is provided
    // It also have parameter list and also not
    // method body contains actual implementation of method
    public void displaynumber(int num)
    {
        System.out.println("Number is "+num);
    }

    // Class can also have Constructors whose declaration almost same as methods except thier name is same as the class name and they dont have any return type
    // The constructor is invoked to create an object of the class
    // To create new Object a constructer is called by new keyword
    // Constructor is declared as below
    public Main(int numbers)
    {
        this.numbers = numbers;
    }
    // A class can also have no argument constructor as below
    public Main()
    {
        numbers = 10;
    }
    // If constructor is not declared then default no argument constructor is created and used by compiler itself
    // Constructor can also have access modifier to have access level


    // This is main method of the class. this is called entry point of the program.
    public static void main(String[] args) {

        // This is how the consttructor is invoked and used to create an object of the class
        Main objectFromArgumentConstructor  = new Main(20);
        Main objectFromNoArgumentCostructor = new Main();

        // This is how the methods are invoked from object
        // The value passed to the method at the ivoked time of the method is called arguments
        objectFromArgumentConstructor.displaynumber(objectFromArgumentConstructor.numbers);
        objectFromNoArgumentCostructor.displaynumber(objectFromNoArgumentCostructor.numbers);
    }
}
