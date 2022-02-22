package com.company;

public class Main {

    //This variable is Instance variable or non-static field
    String firstname;

    // This varibles is Class Variable or static field
    static String lastname;

    public static void main(String[] args) {

        // This is local Variable used only in main method
        String middlename;
        middlename = "H.";
        Main object = new Main();
        object.firstname = "Shekhar ";
        lastname = "Arya";
        System.out.print(object.firstname);
        object.display(middlename, lastname);
    }

    // Here fname, mname, lname are the parameters
    public void display(String mname, String lname)
    {
        System.out.println(mname+" "+lname);
    }
}
