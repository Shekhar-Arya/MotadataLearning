package com.company;

import java.util.Scanner;

public class Main {

    int front, rear = 0;
    int maxSize = 5;
    int[] numbers;

    Main()
    {
        numbers = new int[maxSize];
    }

    public boolean isEmpty()
    {
        return front==rear;
    }

    public boolean isFull()
    {
        return (front==0 && rear==maxSize-1) || (front==rear+1);
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else {
            if(rear==maxSize-1)
            {
                rear = 0;
                numbers[rear] = data;
            }
            else {
                numbers[rear] = data;
                rear++;
            }
        }
    }

    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else {
            front++;
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println(numbers[front]+" is at the first");
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else {
            /*int i = front;
            System.out.println("Hi");*/
            if(rear>front)
            {
                for (int i = front;i<rear;i++)
                {
                    System.out.print(numbers[i]+" ");
                }
            }
            else
            {
                for (int i = front; i < maxSize; i++) {
                    System.out.print(numbers[i]+" ");
                }
                for (int i = 0; i <=rear; i++) {
                    System.out.print(numbers[i]+" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int choice = 0;
        Main obj = new Main();

        while (choice!=7)
        {
            System.out.println("Choose from the below Options");
            System.out.println("\n1 = isEmpty\n2 = isFull\n3 = enqueue\n4 = dequeue\n5 = display\n6 = peek\n7 = Exit");
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Queue is Empty : "+obj.isEmpty());
                    break;
                case 2:
                    System.out.println("Queue is Full : "+obj.isFull());
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
                    obj.peek();
                    break;
                case 7:
                    break;
            }
        }
        // write your code here
    }
}
