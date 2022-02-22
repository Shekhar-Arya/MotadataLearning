package com.company;

/**
 * Created by shekhar on 10/11/21.
 */


public class EncapsulatedClass {

    // This are the private variables which are not accessible outside the class so we will use getter ad setter methods as below:
    private String firstName;
    private String lastName;

    //This is getter method for firstname
    public String getFirstName() {
        return firstName;
    }

    // This setter method for firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
