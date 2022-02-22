import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class StackUsingArray {
    int top;
    int maxSize = 5;
    int[] numArray = new int[maxSize];

    StackUsingArray()
    {
        top=-1;
    }

    public boolean isEmpty()
    {
        return top<0;
    }

    public boolean isFull()
    {
        return top==maxSize-1;
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("OverFlow!!");
        }
        else
        {
            top++;
            numArray[top] = data;
            System.out.println(data+" is added to the stack");
        }
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("UnderFlow");
        }
        else
        {
            top--;
            System.out.println("Element is poped out");
        }
    }

    public void peek(int index)
    {
        if(index>top || index<0)
        {
            System.out.println("Invalid Index");
        }
        else
        {
            System.out.println("At "+index+" : "+numArray[index]);
        }
    }

    public void count()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else{
            int count = top+1;
            System.out.println("There is "+count+" elements");
        }
    }

    public void change(int index, int value)
    {
        if(index>top || index<0)
        {
            System.out.println("Invalid Index");
        }
        else
        {
            numArray[index]= value;
            System.out.println("Value changed at "+index);
        }
    }

    public void display()
    {
        for (int i = top; i >=0 ; i--) {
            System.out.print(+numArray[i]+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackUsingArray createStack = new StackUsingArray();
        int choice=0;

        while(choice!=9)
        {

            System.out.println("------------------------------");
            System.out.println("Choose from the following");
            System.out.println("\n1 = isEmpty\n2 = push\n3 = pop\n4 = peek\n5 = count\n6 = change\n7 = display\n8 = isFull\n9 = Exit");
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Stack is Empty : "+createStack.isEmpty());
                    break;
                case 2:
                    System.out.println("Please Enter the Element");
                    int number = s.nextInt();
                    createStack.push(number);
                    break;
                case 3:
                    createStack.pop();
                    break;
                case 4:
                    System.out.println("Please Enter the Index");
                    int index = s.nextInt();
                    createStack.peek(index);
                    break;
                case 5:
                    createStack.count();
                    break;
                case 6:
                    System.out.println("Please Enter the index to change on");
                    int index1 = s.nextInt();
                    System.out.println("Please Enter the Element");
                    int value = s.nextInt();
                    createStack.change(index1,value);
                    break;
                case 7:
                    createStack.display();
                    break;
                case 8:
                    System.out.println("Stack is Full : "+createStack.isFull());
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Please select valid choice");
            }
        }

    }

}
