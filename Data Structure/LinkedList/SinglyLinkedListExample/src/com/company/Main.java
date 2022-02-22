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
        return front==null;
    }

    public void insertAtRear(int data)
    {
        Node temp = new Node();
        if(temp==null)
        {
            System.out.println("Memory is full");
        }
        else {
            temp.data = data;
            if(isEmpty())
            {
                front = temp;
                rear = temp;
                //front.next = rear;
            }
            else {
                rear.next = temp;
                rear = temp;
            }
        }
    }

    public void insertAtFront(int data)
    {
        Node temp = new Node();
        if(temp==null)
        {
            System.out.println("Memory is full");
        }
        else {
            temp.data = data;
            if(isEmpty())
            {
                front = temp;
                rear = temp;
                //front.next = rear;
            }
            else {
                temp.next = front;
                front = temp;
            }
        }
    }

    public void deleteFromFront()
    {
        if(isEmpty())
        {
            System.out.println("Linked List is Empty");
        }
        else {
            front = front.next;
        }
    }

    public int search(int data)
    {
        Node temp = front;
        int count =0;
        while (temp!=null)
        {
            if(temp.data ==data)
                return count;
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void display()
    {
        Node temp = front;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int choice = 0;
        Main obj = new Main();

        while (choice!=7)
        {
            System.out.println("Choose from the below Options");
            System.out.println("\n1 = isEmpty\n2 = Insert from Front\n3 = Insert From Rear\n4 = Delete\n5 = Search Element\n6 = Display\n7 = Exit");
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
                    obj.deleteFromFront();
                    break;
                case 5:
                    System.out.println("Please enter element");
                    int data2 = s.nextInt();
                    System.out.println(obj.search(data2));
                    break;
                case 6:
                    obj.display();
                    break;
                case 7:
                    break;
            }
        }
    }
}
