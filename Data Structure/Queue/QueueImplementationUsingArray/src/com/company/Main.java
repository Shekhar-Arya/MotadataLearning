package com.company;

import java.util.Scanner;

public class Main {

    int front , rear = 0;
    int maxCapacity = 5;
    int[] queue;

    Main(){
        queue = new int[maxCapacity];
    }

    public boolean isEmpty()
    {
        return front==rear;
    }

    public boolean isFull()
    {
        return rear==maxCapacity-1;
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else {
            queue[rear] = data;
            rear++;
            System.out.println(data+" is Added to the Queue");
        }
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else {
            //queue[front]= Integer.parseInt(null);
            System.out.println(queue[front]+" is removed from the Queue");
            front++;
        }
    }

    public void display()
    {
        for (int i = front; i <rear; i++) {
            System.out.print(queue[i]+" ");
            //System.out.println(queue.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int choice = 0;
        Main obj = new Main();

        while (choice!=6)
        {
            System.out.println("Choose from the below Options");
            System.out.println("\n1 = isEmpty\n2 = isFull\n3 = enqueue\n4 = dequeue\n5 = display\n6 = Exit");
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
                    break;
            }


        }
    }
}
