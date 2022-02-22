package com.company;

import java.util.Scanner;

public class Main {
    private class Node
    {
        int data;
        Node link;
    }

    Node top;

    Main(){
        this.top = null;
    }

    public boolean isEmpty()
    {
        return top==null;
    }

    public void push(int data)
    {
        Node temp = new Node();
        if(temp==null)
        {
            System.out.println("Memory is Full");
        }
        else {
            temp.data = data;
            temp.link=top;
            top = temp;
            System.out.println(data+" added to the Stack");
        }
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else {
            top = top.link;
            System.out.println("Element is poped from Stack");
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Data at the top is : "+top.data);
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.link;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Main createStack = new Main();
        int choice = 0;
        while (choice!=6)
        {
            System.out.println("Choose from the following");
            System.out.println("\n1 = isEmpty\n2 = push\n3 = pop\n4 = display\n5 = peek\n6 = Exit");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Stack is Empty : "+createStack.isEmpty());
                    break;
                case 2:
                    System.out.println("Enter the Data");
                    int data = s.nextInt();
                    createStack.push(data);
                    break;
                case 3:
                    createStack.pop();
                    break;
                case 4:
                    createStack.display();
                    break;
                case 5:
                    createStack.peek();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please Enter valid Choice");
                    break;
            }

        }

    }
}
