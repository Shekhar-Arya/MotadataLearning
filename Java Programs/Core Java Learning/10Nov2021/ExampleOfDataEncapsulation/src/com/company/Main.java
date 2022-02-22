package com.company;

public class Main {

    public static void main(String[] args) {

        EncapsulatedClass encapsulatedClass = new EncapsulatedClass();
        // This is how we set the value of the private variables
        encapsulatedClass.setFirstName("Shekhar");
        encapsulatedClass.setLastName("Arya");

        // This is how we get the value of the private variables
        System.out.println(encapsulatedClass.getFirstName()+" "+encapsulatedClass.getLastName());
    }
}
