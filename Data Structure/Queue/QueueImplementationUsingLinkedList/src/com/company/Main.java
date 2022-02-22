package com.company;

import java.util.Scanner;

public class Main {
    private class Node {
        int data;
        Node next;
    }
    Node rear,front;
    Main()
    {
        rear =null;
        front = null;
    }

    public boolean isEmpty()
    {
        return front==null;
    }

    public void enqueue(int data)
    {
        Node temp = new Node();
        if(temp==null)
        {
            System.out.println("Memory is full");
        }
        else {
            temp.data = data;
            if(front==null && rear==null)
            {
                front = temp;
                rear = temp;
            }
            else{
                rear.next = temp;
                rear = temp;
            }
        }
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else {
            front = front.next;
            if(front== null)
            {
                rear = null;
            }
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Peek value is : "+front.data);
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            Node temp = front;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
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
