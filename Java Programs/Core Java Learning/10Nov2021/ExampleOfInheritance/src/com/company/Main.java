package com.company;

// This is Child Class which is inheriting the ParrentClass
public class Main extends ParentClass {



    public static void main(String[] args) {

    	// This is creating the Object of current class
    	Main objectOfChildClass = new Main();

    	//This is using the properties of Parent class in this class
    	objectOfChildClass.name = "Shekhar";
    	objectOfChildClass.display();
    }
}
