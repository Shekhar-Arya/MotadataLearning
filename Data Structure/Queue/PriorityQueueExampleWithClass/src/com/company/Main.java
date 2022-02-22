package com.company;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<Patient>(new PatientComparator());
        Patient p1 = new Patient(1,1,"Shekhar");
        Patient p2 = new Patient(2,2,"Shek");
        Patient p3 = new Patient(3,3,"She");
        Patient p4 = new Patient(4,3,"Sh");
        priorityQueue.add(p1);
        priorityQueue.add(p4);
        priorityQueue.add(p3);
        priorityQueue.add(p2);
        /*
        priorityQueue.add(new Patient(2,2,"Shek"));
        priorityQueue.add(new Patient(3,3,"She"));
        priorityQueue.add(new Patient(4,3,"Sh"));
*/
        System.out.println(priorityQueue);
	// write your code here
    }
}
