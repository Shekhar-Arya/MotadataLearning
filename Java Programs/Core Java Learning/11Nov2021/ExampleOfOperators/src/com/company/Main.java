package com.company;

public class Main {

    public static void main(String[] args) {

        // Simple Assignment operator
        // here = is assignment operator
        int x = 11;
        int y = 2;

        // Arthmetic operator
        int add = x+y;
        int subtract = x-y;
        int multiply = x*y;
        int qutiont = x/y;
        int reminder = x%y;

        System.out.println("Addition of "+x+ " and "+y+ " is "+add);
        System.out.println("Subtraction of "+x+ " and "+y+ " is "+subtract);
        System.out.println("Multiplication of "+x+ " and "+y+ " is "+multiply);
        System.out.println("Division for Qutiont of "+x+ " and "+y+ " is "+qutiont);
        System.out.println("Division for Reminder of "+x+ " and "+y+ " is "+reminder);
        System.out.println();

        // We can also use assignment operator and arthmetic operator togather as follow:
        x+=y;
        // This means x= x+y;
        System.out.println("Addition of 11 and "+y+ " using += "+x);
        x-=y;
        System.out.println("Subtraction of 13 and "+y+ " using -= "+x);
        x*=y;
        System.out.println("Multiplication of 11 and "+y+ " using *= "+x);
        x/=y;
        System.out.println("Division for Qutiont of 22 and "+y+ " using /= "+x);
        x%=y;
        System.out.println("Division for Reminder of 11 and "+y+ " using %= "+x);

        System.out.println();

        // Unary Operators

        // + represents positive value
        x = +10;
        System.out.println("+ unary operator "+x);

        //- represents negative value
        x = -10;
        System.out.println("- unary operator"+ x);

        //++ represents incereament of value by 1;
        x++;
        System.out.println("++ unary operator "+ x);

        //-- represents decreament of value by 1;
        x--;
        System.out.println("-- unary operator "+x);

        // ! is used to invert the value of the boolean variables
        boolean bool = true;
        System.out.println("! unary operator "+ !bool);

        System.out.println();

        // Post and Pre Increament and Decreament
        // ++variable is Pre Increment and --varibale is Pre Decrement
        //variable-- is Post Increment and varibale-- is Post Decrement

        // Post incremnet will first use the value and then increment the variable same goes to decrement
        // And Pre increment will first increment the value and then use the value
        //Example as below
        System.out.println("Example of Post Increment "+ x++);
        System.out.println("Example of Post Decrement "+ x--);
        System.out.println("Example of Pre Increment "+ ++x);
        System.out.println("Example of Pre Decremnt "+ --x);


        x = 20;

        System.out.println();
        //Equality and Relational Operator

        // == this checks that both have the same value or not
        if(x==y)
        {
            System.out.println("Yes x is equal to y");
        }
        else
        {
            System.out.println("No x is not equal to y");
        }

        // != this checks the value of variables are not equal
        if(x!=y)
        {
            System.out.println("Yes x is not equal to y");
        }

        // > checks one value is greater than other or not
        if(x>y)
        {
            System.out.println("Yes x is greater than y");
        }

        //< check wether one value is smaller than other or not
        if(x<y)
        {
            System.out.println("Yes x is less than y");
        }
        else
        {
            System.out.println("No x is not less than y");
        }

        // >= checks the value is greater than or equal to the other value
        if(x>=y)
        {
            System.out.println("Yes x is greater or equal than y");
        }

        // <= checks the value is lesser than or equal to the other value
        if(x<=y)
        {
            System.out.println("Yes x is less than or equal to y");
        }
        else
        {
            System.out.println("No x is not less than or equal to y");
        }


        System.out.println();

        // Conditional operators
        // AND operators &&
        if(x>y && x<y)
        {
            System.out.println("Yes X is greater than Y AND also less than Y");
        }
        else
        {
            System.out.println("No X is not greater than Y AND also not less than Y");
        }

        //OR Operator ||
        if(x>y||x<y)
        {
            System.out.println("Yes X is greater than Y OR also less than Y");
        }

        System.out.println();

        // instance Of operator
        // It is used to check wether the Object is of that particular class
        Main object = new Main();

        if(object instanceof Main)
        {
            System.out.println("Yes object is Main class");
        }


        System.out.println();
        // Bitwise Operators

        // ~ operator is used to convert all '1' to '0' and all '0' to '1'
        int a = 2;
        System.out.println(" Before Value "+Integer.toBinaryString(a));
        a=~2;
        System.out.println(" After value "+Integer.toBinaryString(a));

        // << is used to left shift the pattern
        a=2;
        System.out.println(" Before Left shift "+Integer.toBinaryString(a));
        a<<=2;
        System.out.println(" After Left shift "+Integer.toBinaryString(a));

        // >> is used to right shift the pattern
        a=2;
        System.out.println(" Before right shift "+Integer.toBinaryString(a));
        a>>=2;
        System.out.println(" After right shift "+Integer.toBinaryString(a));
    }
}
