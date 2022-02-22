package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // LinkedHashSet is used to store the Unique values only
        // It allows only one null value
        // It internally uses HashMap and Hashing technique to store the data
        // It does maintain order

        // Normal Constructor
        LinkedHashSet<Integer> LinkedHashSet = new LinkedHashSet<Integer>();
        // Constructor with Collection
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<Integer>(Arrays.asList(new Integer[]{1,2,3,4}));

        // Methods in LinkedHashSet
        // 1. Insertion Methods
        // add(data) method add the element to the LinkedHashSet
        LinkedHashSet.add(5);
        // addAll(Collection c) method all the element of the collection to the LinkedHashSet
        LinkedHashSet.addAll(integerLinkedHashSet);

        // 2. deletion method
        // remove(element) method remove the specified element from the LinkedHashSet
        LinkedHashSet.remove(1);
        // removeIf(lambda) method remove element if specific condition is true
        LinkedHashSet.removeIf(integer -> integer.equals(2));
        // removeAll(Collection) method remove all the element in LinkedHashSet that are in Collection too.
        LinkedHashSet.removeAll(integerLinkedHashSet);
        // clear() method remove all the element from the LinkedHashSet
        LinkedHashSet.clear();

        // 3. Extra Methods used in LinkedHashSet
        // contains(element) method check whether the specified element is present in LinkedHashSet or not
        LinkedHashSet.contains(5);
        // containsAll(Collection) method check whether specified Collection elements are present in LinkedHashSet
        LinkedHashSet.containsAll(integerLinkedHashSet);
        // isEmpty() method check whether the LinkedHashSet is Empty or not
        LinkedHashSet.isEmpty();
        // size() method return the total number of Element in LinkedHashSet
        LinkedHashSet.size();

        // it also has methods like toArray() and toString()


        // 1. Insertion Methods
        // add(data) method add the element to the LinkedHashSet
        LinkedHashSet.add(5);
        // addAll(Collection c) method all the element of the collection to the LinkedHashSet
        LinkedHashSet.addAll(integerLinkedHashSet);

        // Traversing through LinkedHashSet

        // Using iterator
        Iterator iterator = LinkedHashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using Iterator "+iterator.next());
        }

        // Using forEach Method
        LinkedHashSet.forEach(integer -> System.out.println("Using ForEach Method "+integer));

        // Using ForEach loop
        for (Integer i: LinkedHashSet
        ) {
            System.out.println("Using forEach Loop "+i);
        }

    }
}
