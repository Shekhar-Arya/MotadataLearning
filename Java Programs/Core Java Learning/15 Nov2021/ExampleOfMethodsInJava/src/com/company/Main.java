package com.company;

public class Main {

    public static void main(String[] args) {

        // There are four types of method in Java
        // 1 - No return type no parameter
        // 2 - No return type with parameter
        // 3 - with parameter no return type
        // 4 - with parameter with return type

        Main object = new Main();
        object.display();
        object.addAndDisplay(10,20);

        // For value returning methods we have to store the return the value to use further
        System.out.println("This method is with Return type and No Prameter and return value is "+object.number());
        System.out.println("This method is wit return type with Parameter and value of addition is "+object.addAndReturn(10,30));

        // Java ALso supports method Overloading
        // Which means a class can have methods whose name are same but method signature should be different which is numbers of parameters and types of parameters passed in methods

        object.addAndDisplay(10,20,30);
        object.addAndDisplay(10.50, 20);
        object.addAndDisplay(10, 20.50);

    }

    // Here each type of method is declared
    public void display()
    {
        System.out.println(" This method is No return type No Parameters");
    }

    public void addAndDisplay(int a, int b)
    {
        int c = a+b;
        System.out.println(" This method is No return type with Parameter and value for addintion is "+c);
    }

    public void addAndDisplay(int a, int b, int c)
    {
        int d = a+b+c;
        System.out.println(" This method is Method Overloaded method which have different number of parameter and value for addition is "+d);
    }
    public void addAndDisplay(double a, int b)
    {
        double c = a+b;
        System.out.println(" this method is method overload method which have different types of parameter and value for addition is "+c);
    }
    public void addAndDisplay(int a, double b)
    {
        double c =a+b;
        System.out.println(" This method is method Overlaod method which have different order of the types of parameter but same number and same types of parameter \n and value of addition is "+c);
    }

    public int number()
    {
        return 10;
    }

    public int addAndReturn(int a, int b)
    {
        return a+b;
    }
}
