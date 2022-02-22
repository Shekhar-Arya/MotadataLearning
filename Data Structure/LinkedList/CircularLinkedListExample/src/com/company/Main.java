package com.company;

import java.util.Scanner;

public class Main {

    private class Node
    {
        int data;
        Node next;
    }

    Node front;
    Node rear;
    Main()
    {
        front = null;
        rear = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void insertAtFront(int data)
    {
        Node temp = new Node();
        if(temp==null)
        {
            System.out.println("Memory is Full");
        }
        else {
            temp.data = data;
            if(isEmpty())
            {
                front = temp;
                rear = temp;
                front.next = rear;
            }
            else {
                temp.next = front;
                front = temp;
                rear.next= front;
            }
        }
    }

    public void insertAtRear(int data)
    {
        Node temp = new Node();
        if(temp==null)
        {
            System.out.println("Memory is Full");
        }
        else {
            temp.data = data;
            if(isEmpty())
            {
                front = temp;
                rear = temp;
                front.next = rear;
            }
            else {
                temp.next = front;
                rear.next= temp;
                rear = temp;
            }
        }
    }

    public void delete()
    {
        if(isEmpty())
        {
            System.out.println("Linked List is Empty");
        }
        else {
            if(front==rear)
            {
                front=null;
                rear = null;
                return;
            }
            front = front.next;
            rear.next = front;
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Linked list is Empty");
        }
        else {
            Node temp = front;
            while (temp.next!=front)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            if(temp.next==front)
            {
                System.out.print(temp.data+" ");
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
            System.out.println("\n1 = isEmpty\n2 = Insert from Front\n3 = Insert From Rear\n4 = Delete\n5 = Display\n6 = Exit");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Linked List is Empty : " + obj.isEmpty());
                    break;
                case 2:
                    System.out.println("Please enter element");
                    int data = s.nextInt();
                    obj.insertAtFront(data);
                    break;
                case 3:
                    System.out.println("Please enter element");
                    int data1 = s.nextInt();
                    obj.insertAtRear(data1);
                    break;
                case 4:
                    obj.delete();
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    break;
            }
        }
    }
}
