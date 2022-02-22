package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    Queue<Integer> q1;
    Queue<Integer> q2;
        Main()
        {
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
        }
        public boolean isEmpty()
        {
            return q1.isEmpty();
        }

        public void push(int data)
        {
            if(q1.isEmpty())
            {
                q1.add(data);
                System.out.println(data+" is Added to the stack");
            }
            else
            {
                while (!q1.isEmpty())
                {
                    q2.add(q1.peek());
                    q1.poll();
                }
                q1.add(data);
                System.out.println(data+" is Added to the stack");
                while (!q2.isEmpty())
                {
                    q1.add(q2.peek());
                    q2.poll();
                }

            }
        }

        public void pop()
        {
            if(q1.isEmpty())
            {
                System.out.println("Stack is Empty");
            }
            else
            {
                q1.poll();
                System.out.println("Element is poped from the Stack");
            }
        }

        public void peek()
        {
            if (q1.isEmpty())
            {
                System.out.println("Stack is Empty");
            }
            else{
                System.out.println("First Element is "+q1.peek());
            }
        }

        public void display()
        {
            if(q1.isEmpty())
            {
                System.out.println("Stack is Empty");
            }
            else
            {
                Queue<Integer> temp = new ArrayDeque<>();
                temp.addAll(q1);
                while (!temp.isEmpty())
                {
                    System.out.print(temp.peek()+" ");
                    temp.poll();
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        Main createStack = new Main();
        int choice = 0;

        while (choice!=6)
        {
            System.out.println("PLease choose from the following:");
            System.out.println("\n1 = isEmpty\n2 = push\n3 = pop\n4 = peek\n5 = display\n6 = Exit");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Stack is Empty : "+createStack.isEmpty());
                    break;
                case 2:
                    System.out.println("Please enter the data");
                    int data = s.nextInt();
                    createStack.push(data);
                    break;
                case 3:
                    createStack.pop();
                    break;
                case 4:
                    createStack.peek();
                    break;
                case 5:
                    createStack.display();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }
        }
    }
}
