package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 3;
        // Decision making statemnt are as follow:

        // Only if block
        if (number>0)
        {
            System.out.println("If condition is true");
        }
        // If block will only executes when the condition inside the if condition will be true

        System.out.println();
        // Example of if-else
        if(number==0)
        {
            System.out.println("Only prints if condition is true");
        }
        else
        {
            System.out.println("Only prints if condition false");
        }
        // If if block is false then it will jump to else and executes it.
        System.out.println();

        // If we have series of condition to check then we can use else-if block as below:
        if(number==1)
        {
            System.out.println("You got first prize");
        }
        else if(number==2)
        {
            System.out.println("You got second prize");
        }
        else if(number==3)
        {
            System.out.println("You got third prize");
        }
        else
        {
            System.out.println("You got no prize");
        }
        System.out.println();
        //We can also uses nested if and else
        // Means if else inside a if else

        if(number>0)
        {
            if(number==3)
            {
                System.out.println("Yes number is 3");
            }
            else
            {
                System.out.println("No number is not 3 but greater than 0");
            }
        }
        else
        {
            System.out.println("No number is not greater than 0");
        }
        System.out.println();

        // For Multiple Excecution path like above we can also use Switch statment
        switch (number)
        {
            case 1:
                System.out.println("You got first prize");
                break;

            case 2:
                System.out.println("You got second prize");
                break;

            case 3:
                System.out.println("You got third prize");
                break;

            default:
                System.out.println("You got no prize");
        }
        System.out.println();

        // Lets see if we dont use the break statment than what happens
        switch (number)
        {
            case 1:
                System.out.println("You got first prize");
                break;

            case 2:
                System.out.println("You got second prize");
                break;

            case 3:
                System.out.println("You got third prize");

            default:
                System.out.println("You got no prize");
        }

        // without break statment it will print all the cases or executes that block after the case matches
    }
}
