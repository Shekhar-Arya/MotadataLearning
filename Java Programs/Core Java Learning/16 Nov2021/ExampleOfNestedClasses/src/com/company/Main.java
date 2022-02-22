package com.company;

public class Main {

    int number = 90;
    public static void main(String[] args) {


        // Nested class means class inside a class
        // This is used as this increase the encapsulation
        // And it lead to more readable and maintainable code
        // There are two types of nested classes
        // 1 - Non-static class also known as inner class
        //2 - static class also known as static nested class
        // Non static class have access to outer class members
        // static class dont have access to outer class member
        // we can create nested class anywhere in the class even in the methods too

        // We can use objet reference for non static inner class to access its element as below
        Main outerObject = new Main();
        Main.InnerClass innerClass = outerObject.new InnerClass();
        innerClass.print();

        // We cant use object reference to access static inner class we have to create its own object as below
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.print();

    }

    // This is example of Non static nested class
    class InnerClass
    {
        void print()
        {
            // This class can access number variable directly
            System.out.println("This is from non static inner "+ number);
        }
    }

    static class StaticInnerClass
    {
        void print()
        {
            // We cant access members from static class
            //System.out.println("This is from static inner "+number);
            System.out.println("This is from static inner class");
        }
    }

}
