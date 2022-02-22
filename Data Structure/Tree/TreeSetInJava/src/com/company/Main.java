package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Tree Set is data structure which stores the unique data
        // It maintains the ascending order or order based on comparator provided in constructor
        // It does not allow null value
        // Retrieval and access is fast
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(new Integer[]{1,2,3,4}));

        // TreeSet Constructor
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>(Comparator.reverseOrder());
        TreeSet<Integer> treeSet2 = new TreeSet<>(linkedList);

        // Methods in TreeSet
        // 1. for Insertion of data
        // add(element) method to add element in tree set
        treeSet.add(9);
        // addAll(Collection) method add all data from Collection to treeSet
        treeSet.addAll(linkedList);


        // 2. Remove element from tree set
        // pollFirst() method removes and returns first element or null
        treeSet.pollFirst();
        // pollLast() method removes and returns last element or null
        treeSet.pollLast();
        // remove(element) removes the specified element
        treeSet.remove(4);
        // clear() method to remove all element from treeSet
        treeSet.clear();


        // 1. for Insertion of data
        // add(element) method to add element in tree set
        treeSet.add(9);
        // addAll(Collection) method add all data from Collection to treeSet
        treeSet.addAll(linkedList);




        // 3. Element Retrieving
        // ceiling(element) method return least element in the set gretaer than or equal to given element
        treeSet.ceiling(2);
        // floor(element) method returns greatest element in the set lower than or equal to given element
        treeSet.floor(3);
        // first() returns the first element currently in the treeset
        treeSet.first();
        // last() returns the last element in the treeset
        treeSet.last();
        // higher(element) method returns the least element which is stictly greater than given element
        treeSet.higher(2);
        // lower(lower) method returns the greatest element which is strictly lower than given element
        treeSet.lower(3);

        // 4. Getting SubSet
        // headSet(toElement) method of Sorted set returns set view of elements from starting to given element exclusive
        treeSet.headSet(3);
        // headSet(toElement, boolean inclusive) method of NavigableSet returns the set view of elements from starting to given element inclusive if boolean inclusive is true
        treeSet.headSet(3,true);
        // tailSet(fromElement) method of Sorted set returns the set View of elements from given element(inclusive) to last element
        treeSet.tailSet(2);
        // tailSet(fromElement, boolean inclusive) method of NavigableSet returns the set view of element from given element(inclusive if boolean inclusive is true) to last element
        treeSet.tailSet(2,true);
        // subSet(fromElement, toElement) method of Sorted Set return the set view of element from given fromElement(inclusive) to given toElement(Exclusive)
        treeSet.subSet(2,4);
        // subSet(fromElement, boolean FromInclusive, toElement, toInclusive) method of Navigable Set returns the set view of elements from given elements inclusive if Inclusivs are true.
        treeSet.subSet(2,true,4,true);
        // descendingSet() method of Navigable Set returns the reverse set view of elements
        treeSet.descendingSet();

        // 5. Other Methods
        // isEmpty() returns wether treeset is empty or not
        treeSet.isEmpty();
        // contains(element) returns whether the treeset contains the element or not
        treeSet.contains(2);
        // size() returns the total number of elements in treeset
        treeSet.size();


        // iterate over the TreeSet

        // Using iterator
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using iterator "+iterator.next());
        }

        // Using descending iterator  in reverse
        Iterator<Integer> iterator1 = treeSet.descendingIterator();
        while (iterator1.hasNext())
        {
            System.out.println("Using Descending iterator in reverse "+iterator1.next());
        }

        // Using Descending set iterator in reverse
        Iterator<Integer> iterator2 = treeSet.descendingSet().iterator();
        while (iterator2.hasNext())
        {
            System.out.println("Uisng Descending Set for reverse "+iterator2.next());
        }

        // ForEach Method
        treeSet.forEach(integer -> System.out.println("Using For Each method "+ integer));

        // Using ForEach loop
        for (Integer i: treeSet
             ) {
            System.out.println("Using for each loop "+i);
        }


    }
}
