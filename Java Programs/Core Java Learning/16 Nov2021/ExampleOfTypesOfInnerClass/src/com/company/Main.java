package com.company;

public class Main extends ParentClass {


    public static void main(String[] args) {

        // There are addition two types of Inner class
        // 1 - Local class
        // 2 - Anonymous class

        // Local classes are inner classes which are declared with name
        // Anonymous classes are inner class which are declare and instantiate at same time
        // Anonmyous class will always be used with interface or extended class
        // Example of Anonymous
        ParentClass anonymous = new ParentClass(){
            @Override
            void print() {
                super.print();
            }
        };

        Main object = new Main();
      localInnerClass InnerClass = object.new localInnerClass();
        InnerClass.print();
        anonymous.print();
    }
    // Example of local class
    class localInnerClass
    {
        void print()
        {
            System.out.println("Hi from local inner class");
        }
    }




}
