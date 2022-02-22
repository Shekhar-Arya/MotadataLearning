package com.company;

import java.util.*;

public class Main {

    Stack<Integer> stack1,stack2;
    Main()
    {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public boolean isEmpty()
    {
        return stack1.empty();
    }

    public void enqueue(int data)
    {
        if (isEmpty())
        {
            stack1.push(data);
        }
        else {
            while (!stack1.empty())
            {
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while (!stack2.empty())
            {
                stack1.push(stack2.pop());
            }
        }
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!!");
        }
        else {
            stack1.pop();
        }
    }

    public void peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow!!");
        }
        else {
            System.out.println(stack1.peek()+" is at the Top");
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            Stack<Integer> temp = new Stack<Integer>();
            temp.addAll(stack1);
            while (!temp.isEmpty())
            {
                System.out.print(temp.pop()+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int choice = 0;
        Main obj = new Main();

        while (choice!=6)
        {
            System.out.println("Choose from the below Options");
            System.out.println("\n1 = isEmpty\n2 = peek\n3 = enqueue\n4 = dequeue\n5 = display\n6 = Exit");
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Queue is Empty : "+obj.isEmpty());
                    break;
                case 2:
                    obj.peek();
                    break;
                case 3:
                    System.out.println("Pleae enter element");
                    int data = s.nextInt();
                    obj.enqueue(data);
                    break;
                case 4:
                    obj.dequeue();
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    break;
            }


        }
        // write your code here


    }
}
