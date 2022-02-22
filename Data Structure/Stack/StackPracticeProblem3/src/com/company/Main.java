package com.company;

import java.util.Scanner;
import java.util.Stack;

// Infix To PostFix Example
public class Main {

    public int precedence(char c)
    {
        switch (c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Stack<Character> stack = new Stack<>();
        Main obj = new Main();
        String result = "";
        for (char ch:input.toCharArray()
             ) {
            if(obj.precedence(ch)>0)
            {
                while (stack.empty() == false && (obj.precedence(stack.peek()) >= obj.precedence(ch)))
                {
                    result+=stack.pop();
                }
                stack.push(ch);
            }
            else if (ch==')')
            {
                char x = stack.pop();
                while (stack.empty()==false && x!='(')
                {
                    result+=x;
                    x = stack.pop();
                }
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else {
                result+=ch;
            }
        }

        for (int i = 0; i <=stack.size(); i++) {
            result+=stack.pop();
        }
        System.out.println(result);
	// write your code here
    }
}
