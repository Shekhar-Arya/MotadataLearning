package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Tree Map is based on Red - Black tree Implementation
        // It stores element in natural ordering of keys or by compartor provided in constructor
        // It doesn't store any null keys but can have multiple null values
        // It is not Synchronized


        // Constructor
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        // Tree map in reverse order
        TreeMap<Integer, String> treeMap1 = new TreeMap<>(Comparator.reverseOrder());


        // Methods of Tree Map
        // 1. Insertion methods
        // put(k,v) add element to treemap in ascending order of key
        treeMap.put(1,"Shekhar");
        treeMap.put(4,"Shekha");
        treeMap.put(5,"Shekh");
        treeMap.put(2,"Shek");
        treeMap.put(3,"She");
        // putAll(Map<k,v>) put all the elements of the Map into treeMap
        treeMap.putAll(treeMap1);

        // 2. Deletion Methods
        // pollFirstEntry() method returns and removes first element of the tree map
        treeMap.pollFirstEntry();
        // polLastEntry() method returns and removes last element of the tree map
        treeMap.pollLastEntry();
        // remove(key) method remove the entry of the specified key
        treeMap.remove(2);
        //clear() method remove all the element from the treeMap
        treeMap.clear();

        // 1. Insertion methods
        // put(k,v) add element to treemap in ascending order of key
        treeMap.put(1,"Shekhar");
        treeMap.put(4,"Shekha");
        treeMap.put(5,"Shekh");
        treeMap.put(2,"Shek");
        treeMap.put(3,"She");
        // putAll(Map<k,v>) put all the elements of the Map into treeMap
        treeMap.putAll(treeMap1);


        // 3. replace methods
        // replace(key , value) method replaces the current value of specified key with given value
        treeMap.replace(1,"Arya");
        // replace(key,oldValue,newValue) method replaces the value of specified key only if its value is equal to oldValue
        treeMap.replace(1,"Shekhar", "Arya");

        // 4. Getting keys
        // ceilingKey(key) method returns the least key greater than or equal to given key or null if no such key
        treeMap.ceilingKey(2);
        // floorKey() returns the greatest key less than or equal to given key or null if no such key
        treeMap.floorKey(3);
        // firstKey() returns the first key in the tree map
        treeMap.firstKey();
        //lastKey() returns the last key in the tree map
        treeMap.lastKey();
        // higherKey(key) returns least key strcictly greater than the given key or null
        treeMap.higherKey(2);
        // lowerKey(key) returns the  greatest key strcitly less than given key or null
        treeMap.lowerKey(3);

        // 5. Getting Map.Entry Set
        // ceilingEntry(K key) Returns a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key.
        // floorEntry(key) Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key.
        // entrySet() Returns a Set view of the mappings contained in this map.
        // firstEntry() Returns a key-value mapping associated with the least key in this map, or null if the map is empty.
        // higherEntry() Returns a key-value mapping associated with the least key strictly greater than the given key, or null if there is no such key.
        // lowerEntry()  Returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key.
        // values() Returns a Collection view of the values contained in this map.


        // other methods
        // get(key) to get the value of the specified key
        treeMap.get(2);
        // size() returns size of map
        treeMap.size();

        // Iterating over TreeMap

        // Using EntrySet
        for (Map.Entry m: treeMap.entrySet()
             ) {
            System.out.println("Using Map.Entry set and for Each" +m.getKey()+" "+m.getValue());
        }

        // Using DescendingMap and entry Set
        for (Map.Entry m:treeMap.descendingMap().entrySet()
             ) {
            System.out.println("Using Map.EntrySet and Descending map "+ m.getKey()+" "+m.getValue());
        }

        // Using keySet
        for (Integer i: treeMap.keySet()
             ) {
            System.out.println("Using keySet "+treeMap.get(i));
        }

        // Using Descending key set
        for (Integer i:treeMap.descendingKeySet()
             ) {
            System.out.println("Using Descending tree set "+treeMap.get(i));
        }

        //Using forEach method
        treeMap.forEach((integer, s) -> System.out.println("Using for Each method "+integer+" "+s));

    }
}
