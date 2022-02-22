package com.company;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.lang.annotation.Repeatable;

public class Main {

    // Annotations are information to compilers
    //some are used at runtime processing
    // Annotations are used by the name preceded by @ sign

    // Annotations can include elements iside it
    // sometimes they named and sometimes unnamed

    @Nullable String ans;
    // We can also define the Annotations as below:

    public @interface Class{
        String Teacher();
        String Date();
        String Devision();
    }

    // This is example of named Annotation
    @Class(Teacher = "Shekhar",Date = "27/5/2000",Devision = "D")
    @Deprecated
    void display()
    {
        System.out.println("This method has Class Annotation");
    }

    // We can also create Repeatable Annotation means one annotation can be applied more than one on same defination
    @Repeatable(Students.class)
    public @interface Student
    {
        String name();
        String rollnum();
    }

    public @interface Students{
        Student[] value();
    }

    @Student(name = "Shekhar", rollnum = "1")
    @Student(rollnum = "2", name = "Arya")
    @Deprecated
    @SuppressWarnings("deprecation")
    void print()
    {
        System.out.println("This method has Student Annotation which is repeatable");
    }

    public static void main(String[] args) {

        // Some of the Annotation are built in java which have different functions like @ deprecated used on display() and print()
        // it tells that these methods are deprecated and are no longer in use. if we try to use it then it will genrate warnings
        // And there is also @ SurpressWarnings which wll surpress specifi type of warnings as below
        Main object = new Main();

        object.display();
        object.print();

        object.ans = null;
        System.out.println(object.ans);
        // There are also some Annotations which are used above the other annotations
        // Such as Documented - This Annotation is used Document Specific annotation
        // And also @Repeatable which is used to tell that this annotatons can be used several times on same defination as I have mention Above

        // Some Annotations are also used before the field or variables as type casting or providing some features to it. As I have used @NotNull here

    }
}
