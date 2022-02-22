package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // HashMap is used to store key and value pair
        // No duplicate keys and only one null key
        // can have multiple null values
        // It doesnt maintain order

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();

        // Methods for hashmap
        // 1. Insertion methods
        // put(key, value) method is used to add the key and value in the hashmap
        map.put(1,"Shekhar");
        map.put(2,"Shek");
        // putAll(map) method puts all element of one map in this map
        map1.putAll(map);
        // putIfAbsent() method put the element in map if key is absent in map
        map.putIfAbsent(1,"Shekhar");


        // 2. Remove methods
        // remove(key) method removes the specified key element entry from map
        map.remove(1);
        // remove(object key, object value) method removes specified key only if mapped to specified value
        map.remove(2,"Shekhar"); // not remove
        // clear() method remove all the entries from the hashmap

        // 3. Get Methods
        // get(key) method returns the value at specified key and null if key is not specified
        map.get(2);
        // getOrDefault(key, value) method returns the value to which key is specified or default value
        map.getOrDefault(2,"Shekhar"); // return value specified at 2 or Shekhar if no key in map

        // 4. Extra Methods in Hashmap
        // containsKey(key) method return true or false based on key present in HashMap or not
        map.containsKey(2);
        // containsValue(value) method return true or false based on value present in HashMap or not
        map.containsValue("Shekhar");
        // isEmpty() check whether map is empty or not
        map.isEmpty();
        // keySet() method returns the set of the keys
        map.keySet();
        // values() method returns the Collection view of values
        map.values();
        // replace(key, value) method replace the key value with specified value only if key is in map
        map.replace(2,"Shekhar");
        // replace(key, oldvalue, newvalue) method replace value of key only if it is mapped with specified old value.
        map.replace(2, "Shek","ShekharArya");
        // size() returns the size of the Hashmap
        map.size();


        // Traverse through Hashmap

        // using entrySet
        for (Map.Entry m: map.entrySet()
             ) {
            System.out.println("Using ForEach and entrySet "+m.getKey() +" "+m.getValue());
        }

        // Using keySet
        for (Integer i:map.keySet()
             ) {
            System.out.println("Using ForEach and keySet "+i+" "+map.get(i));
        }

        // Using ForEach Method
        map.forEach((integer, s) -> {
            System.out.println("Using Foreach method "+integer+" "+s);
        });

        //System.out.println(map.getOrDefault(3, "Shekhar"));

    }
}
