package com.company;

import java.util.Scanner;
import java.util.Stack;


// Input is {[()]} to check the expression is balanced or not
/*{[{}{}]}[()], {{}{}}, []{}() are balanced expressions.

        {()}[), {(}) are not balanced.*/
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String input = s.nextLine();
        boolean ans = false;

        if(input.isEmpty() || input.length()%2!=0)
        {
            System.out.println("Equation is not balanced");
            System.exit(0);
        }

        for (Character ch: input.toCharArray()
             ) {
            if(ch == '(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }

            if(ch==')' || ch=='}' || ch==']')
            {
                char temp = stack.pop();
                if((temp=='(' && ch==')') || (temp=='{'&&ch=='}') || temp=='['&&temp==']')
                {
                    //System.out.println("Expression is not Balanced");
                    ans = true;
                    break;
                }
            }
        }

        if(ans)
        {
            System.out.println("Expression is Balanced");
        }
        else
        {
            System.out.println("Expression is not balanced");
        }

	// write your code here
    }
}
