package com.company;

import java.util.Stack;

public class Main {

    // String Reverse using stack
    public static void main(String[] args) {
        String name = "Shekhar";
        String result = "";
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            charStack.push(name.charAt(i));
        }
        //System.out.println(charStack);

        while (!charStack.empty())
        {
            result+=charStack.pop();
        }
        System.out.println(result);
    }
}
