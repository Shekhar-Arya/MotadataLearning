package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Array list is linear data structure based on dynamic array
        // Its just like array without size limit

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 3, 4}));

        // Methods of ArrayList in java
        // 1. Insertion methods
        // add(obj) method
            arrayList.add(5);
        // add(int i, obj) method insert at specific place
            arrayList.add(1,6);
        // addAll(Collection c) add collection to ArrayList
            arrayList.addAll(temp);
        // addAll(int i, Collection c) add collection at specific index
            arrayList.addAll(1,temp);

        // 2. Deletion Method
        // remove(int index) method remove eleemnt from specific index
            arrayList.remove(1);
        // remove(obj) method remove first occurence of the element
            arrayList.remove(Integer.valueOf(4));
        // removeAll(Collection c) method removes all the element which are in collection
            arrayList.removeAll(temp);
        // clear() to remove all the element in lsit
            arrayList.clear();



        // 1. Insertion methods
        // add(obj) method
        arrayList.add(5);
        // add(int i, obj) method insert at specific place
        arrayList.add(1,6);
        // addAll(Collection c) add collection to ArrayList
        arrayList.addAll(temp);
        // addAll(int i, Collection c) add collection at specific index
        arrayList.addAll(1,temp);



        // 3. To get the Value from ArrayList
        // get(int index) get the value of particualar index
            arrayList.get(1);

        // 4. To replace the value at particualr index
        // set(int index, Element)
            arrayList.set(1,10);

        // 5 Some Basic Methods Extra
        // contains(elelemnt) check whetehr the object is there in list or not
            arrayList.contains(2);
        // indexOf(element) return the index of  first occurence of element
            arrayList.indexOf(5);
        // lastIndexOf(element) returns the last index of last occurence of element
            arrayList.lastIndexOf(5);
        // isEmpty() returns whether the list is empty or not.
            arrayList.isEmpty();
        // sort() sort the list according to the comaparator
            arrayList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    if(integer>t1)
                        return 1;
                    if(integer<t1)
                        return -1;
                    return 0;
                }
            });
        // size() method returns the number of elemnt in ArrayList
            arrayList.size();

            // It also has methods like subList(start index , end index) produces sub list
            // ANd toArray() to convert to array


        // Iterate through ArrayList

        // Using iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using Iterator "+iterator.next());
        }

        // Using listIterator
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println("Using List Iterator "+listIterator.next());
        }

        while (listIterator.hasPrevious())
        {
            System.out.println("Using list Iterator in reverse "+listIterator.previous());
        }

        // Using For Each Method
        arrayList.forEach(n->{
            System.out.println("Using For Each Method"+n);
        });

        // Using For Each method
        for (Integer i: arrayList) {
            System.out.println("Using forEach method "+i);
        }

        // Using for Loop method
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Using foorloop "+i);
        }

    }
}
