package com.company;

import java.util.Scanner;
import java.util.Stack;

    /*Sample Input
        /u/love\i\
        Sample Output
        iloveu
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        String string =  s.nextLine();
        String subString = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '/' || string.charAt(i)=='\\')
            {
                if(subString.isEmpty())
                {
                    continue;
                }
                stack.push(subString);
                subString = "";
                //continue;
            }
            else
            {
                subString+=string.charAt(i);
            }
        }
        String ans= "";
        while (!stack.isEmpty())
        {
            //ans+=stack.peek();
            ans+=stack.pop();
        }
        System.out.println(ans);
   /* Stack<Integer> m  =new Stack<>();
    m.push(1);
    m.push(2);
    m.push(3);
    System.out.println(m);*/
    }
}
