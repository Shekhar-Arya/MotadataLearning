package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // HashSet is used to store the Unique values only
        // It allows only one null value
        // It internally uses HashMap and Hashing technique to store the data
        // It does not maintain order

        // Normal Constructor
        HashSet<Integer> hashSet = new HashSet<Integer>();
        // Constructor with Collection
        HashSet<Integer> integerHashSet = new HashSet<Integer>(Arrays.asList(new Integer[]{1,2,3,4}));

        // Methods in HashSet
        // 1. Insertion Methods
        // add(data) method add the element to the hashset
        hashSet.add(5);
        // addAll(Collection c) method all the element of the collection to the hashset
        hashSet.addAll(integerHashSet);

        // 2. deletion method
        // remove(element) method remove the specified element from the hashset
        hashSet.remove(1);
        // removeIf(lambda) method remove element if specific condition is true
        hashSet.removeIf(integer -> integer.equals(2));
        // removeAll(Collection) method remove all the element in hashset that are in Collection too.
        hashSet.removeAll(integerHashSet);
        // clear() method remove all the element from the hashset
        hashSet.clear();

        // 3. Extra Methods used in HashSet
        // contains(element) method check whether the specified element is present in HashSet or not
        hashSet.contains(5);
        // containsAll(Collection) method check whether specified Collection elements are present in HashSet
        hashSet.containsAll(integerHashSet);
        // isEmpty() method check whether the hashSet is Empty or not
        hashSet.isEmpty();
        // size() method return the total number of Element in hashset
        hashSet.size();

        // it also has methods like toArray() and toString()


        // 1. Insertion Methods
        // add(data) method add the element to the hashset
        hashSet.add(5);
        // addAll(Collection c) method all the element of the collection to the hashset
        hashSet.addAll(integerHashSet);

        // Traversing through HashSet

        // Using iterator
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using Iterator "+iterator.next());
        }

        // Using forEach Method
        hashSet.forEach(integer -> System.out.println("Using ForEach Method "+integer));

        // Using ForEach loop
        for (Integer i: hashSet
             ) {
            System.out.println("Using forEach Loop "+i);
        }


    }
}
