package com.company;

public class Main {

    public static void main(String[] args) {

        //break statement is used to break the execution of looping block or in switch case
        // Two types labled and unlabled

        // example of unlable break
        for (int i=0;i<3;i++)
        {
            if(i==2)
            {
                // this is example of unlabled break statement
                break;
            }
            System.out.println("This block is executed "+i+" times.");
        }
        System.out.println();

        // example of labled break
        test:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==2)
                {
                    //this is an example of labled break statement
                    break test;
                }
                System.out.println(i+" for loop and "+j+" for loop");
            }
        }


        // continue statement is used to skip the current iteration and start the next iterration
        // Two types labled and unlabled
        System.out.println();
        // example of unlabled continue statement
        for (int i = 0; i < 4; i++) {
            if(i==2)
            {
                continue;
            }
            System.out.println("This block is executed "+i+" times.");
        }

        System.out.println();
        //Example of labled continue statement
        test1:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j==3)
                {
                    continue ;
                }
                System.out.println(i+" for loop and "+j+" for loop");
            }
        }

        System.out.println();

        System.out.println(Main.name("Shekhar"));
    }

    // This is how return statemnet is used to return the value from the method to the place where it was invoked
    // return statemnt is alsomethod termination point.
    public static String name(String name)
    {
        return "Hi "+name;
    }
}
