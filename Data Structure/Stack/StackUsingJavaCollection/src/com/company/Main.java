package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Stack Implementation using Java
        Stack<Integer> m = new Stack<Integer>();

        // Java Stack methods
        System.out.println(m.empty());

        System.out.println(m.push(1));
        System.out.println(m.push(2));
        System.out.println(m.push(4));

        System.out.println(m.pop());

        System.out.println(m.search(2));

        System.out.println(m.peek());



        // String Reverse Program
        String name = "Shekhar";
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            charStack.push(name.charAt(i));
        }
        String ans = "";
        while (!charStack.empty())
        {
            ans += charStack.peek();
            charStack.pop();
        }
        System.out.println(ans);
	// write your code here
    }
}
