package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        // Looping staments are used to execute a block of code again and again until the condition given is true

        // while loop is one of the looping statment
        while (i<5)
        {
            System.out.println("This while block is executed "+i+" times.");
            i++;
        }
        System.out.println();

        // we can create infinite loop wit while as follow
        //while(true) {}

        // do-while loop is also looping stament but its slighly different than while loop
        // it actually first execute the block and then chek the condition whether its true or not
        // In this way even if the condition is false he loop will be executed once

        i=1;
        do {
            System.out.println("This do-while block is executed "+i+" times.");
            i++;
        }while (i<5);

        System.out.println();
        // for loop is also looping statement it work as below:
        for (int j =1; j<5; j++)
        {
            System.out.println("This for block is executed "+j+" times.");
        }

        System.out.println();

        // we can create infinite loop using for loop as below;
        //for(;;)

        int[] numbers = {5,6,7,8};
        // there is also for each loop which only works with iterable data types like string and array
        i =1;
        for (int x : numbers) {
            System.out.println("This foreach loop is executed "+i+" times and value is "+x);
            i++;
        }
    }
}
