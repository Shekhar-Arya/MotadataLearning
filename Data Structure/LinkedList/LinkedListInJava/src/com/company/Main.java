package com.company;

import com.sun.org.apache.xpath.internal.axes.DescendantIterator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // LinkedList is linear data structure based on double linked list implementation and Dequeue
        // It can be used as list, Stack, Queue

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(new Integer[]{1,2,3,4}));
        
        // Methods of Linked Lst in Java
        // 1. Insertion methods
        // add(obj) method
        linkedList.add(5);
        // add(int i, obj) method insert at specific place
        linkedList.add(1,6);
        // addAll(Collection c) add collection to linkedList
        linkedList.addAll(linkedList1);
        // addAll(int i, Collection c) add collection at specific index
        linkedList.addAll(1,linkedList1);
        // addFirst(element) add element at first position
        linkedList.addFirst(10);
        // addLast(element) add element at last position
        linkedList.addLast(11);
        // push(element) add element to the stack implemented by list
        linkedList.push(12);
        // offer(element) add element at last of the list
        linkedList.offer(13);
        // offerFirst(element) add element at First of the list
        linkedList.offerFirst(14);
        // offerLast(element) add element at last of the list
        linkedList.offerLast(15);


        // 2. Deletion Method
        // remove(int index) method remove eleemnt from specific index
        linkedList.remove(1);
        // remove(obj) method remove first occurence of the element
        linkedList.remove(Integer.valueOf(4));
        // removeAll(Collection c) method removes all the element which are in collection
        linkedList.removeAll(linkedList1);
        // removeFirst() remove and returns first element of list
        linkedList.removeFirst();
        // removeLast() remove and return last element of list
        linkedList.removeLast();
        // removeFirstOccurence(obj) removes first occuerence of the object
        linkedList.removeFirstOccurrence(Integer.valueOf(1));
        // removeLastOccurence(obj) removes last occurence of object
        linkedList.removeLastOccurrence(Integer.valueOf(2));
        // poll() removes and return head element
        linkedList.poll();
        // pollFirst() removes and return first element of the list
        linkedList.pollFirst();
        // pollLast() removes and return last element of the list
        linkedList.pollLast();
        // pop() removes and returns the element from the stack represented by list
        linkedList.pop();
        // clear() to remove all the element in lsit
        linkedList.clear();



        // 1. Insertion methods
        // add(obj) method
        linkedList.add(5);
        // add(int i, obj) method insert at specific place
        linkedList.add(1,6);
        // addAll(Collection c) add collection to linkedList
        linkedList.addAll(linkedList1);
        // addAll(int i, Collection c) add collection at specific index
        linkedList.addAll(1,linkedList1);



        // 3. To get the Value from linkedList
        // get(int index) get the value of particualar index
        linkedList.get(1);
        // getFirst() get the first element of the list
        linkedList.getFirst();
        // getLast() get the last element of the list
        linkedList.getLast();
        // element() get the head element of the list
        linkedList.element();


        // 4. To replace the value at particualr index
        // set(int index, Element)
        linkedList.set(1,10);

        // 5 Some Basic Methods Extra
        // contains(elelemnt) check whetehr the object is there in list or not
        linkedList.contains(2);
        // indexOf(element) return the index of  first occurence of element
        linkedList.indexOf(5);
        // lastIndexOf(element) returns the last index of last occurence of element
        linkedList.lastIndexOf(5);
        // isEmpty() returns whether the list is empty or not.
        linkedList.isEmpty();
        // sort() sort the list according to the comaparator
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if(integer>t1)
                    return 1;
                if(integer<t1)
                    return -1;
                return 0;
            }
        });
        // size() method returns the number of elemnt in linkedList
        linkedList.size();


        // Itrerate through Linked List

        // Using iterator
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using iterator "+iterator.next());
        }

        // Using Descending iterator to travrse in revrese order
        Iterator<Integer> descendantIterator = linkedList.descendingIterator();
        while (descendantIterator.hasNext())
        {
            System.out.println("Using Descending iterator "+descendantIterator.next());
        }

        // Using listIterator
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println("Using list iterator "+listIterator.next());
        }

        // Using listIterator in reverse
        ListIterator listIteratorreverse = linkedList.listIterator();
        while (listIteratorreverse.hasPrevious())
        {
            System.out.println("Using list iterator "+listIterator.previous());
        }

        // Using forEach method
        linkedList.forEach(integer -> {
            System.out.println("Using for each method"+integer);
        });

        // Using ForEach loop
        for (Integer i:linkedList
             ) {
            System.out.println("Using for each loop "+i);
        }

        // Using For loop
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Using foor loop "+linkedList.get(i));
        }


    }
}
