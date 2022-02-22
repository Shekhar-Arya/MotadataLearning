package com.company;

import java.util.Scanner;
import java.util.Stack;

// PostFix to infix     
public class Main {

    public static boolean isOperand(char ch)
    {
        return ch>='A'&&ch<='Z' || ch>='a'&&ch<='z';
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Stack<String> stack = new Stack<>();
        for (char ch :input.toCharArray()
             ) {
            if(Main.isOperand(ch))
            {
                stack.push(ch+"");
            }
            else
            {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push('('+op2+ch+op1+')');
            }
        }

        System.out.println(stack.peek());
	// write your code here
    }
}
