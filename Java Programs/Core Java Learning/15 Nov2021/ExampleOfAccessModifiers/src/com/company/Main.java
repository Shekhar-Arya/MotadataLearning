package com.company;

import com.shekhar.OutsidePackage;

public class Main extends OutsidePackage{

    public static void main(String[] args) {

        // Different access modifier is used to have different access level of certain fields, methods, or constructor
        // There are for access modifier which have different access levels
        // default - accessed within class and classes within same package
        // private - accessed within its own class only
        // protected - accessed within its own class, within its own package and outside the package but only to subclasses.
        // public - accessed within its own class, its own package, outside the package in short everywhere

        PackageClass packageClass = new PackageClass();
        packageClass.dispaly3();
        packageClass.display2();
        packageClass.display4();

        Main object = new Main();
        object.display1();

        OutsidePackage outsidePackage = new OutsidePackage();
        outsidePackage.display4();

        object.dispaly3();

    }

    // Here this method will be only accessed within a class.
    private void display1() {
        System.out.println("This is Hi from private method of Package class");
    }

}
