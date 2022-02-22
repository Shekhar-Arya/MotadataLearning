package com.company;

import java.util.Scanner;

public class Main {

    private class Node
    {
        int data;
        Node next;
        Node previous;
    }

    Node front;
    Node rear;
    Main()
    {
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void insertAtRear(int data){
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
            }
            else {
                temp.previous = rear;
                rear.next = temp;
                rear = temp;
            }
        }
    }

    public void insertAtFront(int data){
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
            }
            else {
                temp.next = front;
                front.previous = temp;
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
            front.previous = null;
        }
    }

    public void deleteFromRear()
    {
        if(isEmpty())
        {
            System.out.println("Linked List is Empty");
        }
        else {
            rear = rear.previous;
            rear.next = null;
        }
    }

    public int search(int data)
    {
        Node temp = front;
        int count=0;
        while (temp!=null)
        {
            if(temp.data == data)
                return count;
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public void displayFromFront()
    {
        if(isEmpty())
        {
            System.out.println("Linked List is Empty");
        }
        Node temp = front;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayFromRear()
    {
        if(isEmpty())
        {
            System.out.println("Linked List is Empty");
        }
        Node temp = rear;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int choice = 0;
        Main obj = new Main();

        while (choice!=9)
        {
            System.out.println("Choose from the below Options");
            System.out.println("\n1 = isEmpty\n2 = Insert from Front\n3 = Insert From Rear\n4 = Delete from front\n5 = Delete from rear\n6 = Search Element\n7 = Display from front\n8 = Display from rear\n9 = Exit");
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
                    obj.deleteFromRear();
                    break;
                case 6:
                    System.out.println("Please enter element");
                    int data2 = s.nextInt();
                    System.out.println(obj.search(data2));
                    break;
                case 7:
                    obj.displayFromFront();
                    break;
                case 8:
                    obj.displayFromRear();
                case 9:
                    break;
            }
        }
    }
}
