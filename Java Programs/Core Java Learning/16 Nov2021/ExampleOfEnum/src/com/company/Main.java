package com.company;

public class Main {


    // Enum is a data type in which contains fixed set of constants
    // It can be used for the Days of week or Months and etc.

    // We can create Enum anywhere even outside the class
    // Example of Enum
    enum Seasons{
        SUMMER(40), WINTER(30), RAIN(20), SPRING(10);

        int value;
        Seasons(int i) {
        value = i;
        }

        void print()
        {
            System.out.println("Hi from Enum");
        }
    }
    public static void main(String[] args) {

        // We can Access Enum values many ways
        for (Seasons s: Seasons.values()
             ) {
            System.out.println("Using For Each loop "+s);
        }
        System.out.println();

        Seasons s = Seasons.WINTER;
        System.out.println("Using without for loop "+s);

        System.out.println(
        );
        System.out.println("Using valueOf Method "+Seasons.valueOf("WINTER"));
        System.out.println();

        System.out.println("To get the index of value of"+Seasons.valueOf("WINTER")+" is "+Seasons.valueOf("WINTER").ordinal());
        System.out.println();

        System.out.println("We can also have value of the enum type values and we can access them as below");
        for (Seasons x:Seasons.values()
             ) {
            System.out.println("Enum constatnt is "+x+ " And its value is "+x.value);

        }
        System.out.println();

        // We can also have methods and constructor inside
        Seasons.WINTER.print();
    }
}
