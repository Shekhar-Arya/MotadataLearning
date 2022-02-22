import  java.util.*;
class StringMethodsExample{  
public static void main(String args[]){


String name="javatpoint";
String name1 = "Java";

// charAt() Method   
char ch=name.charAt(4);//returns the char value at the 4th index  
System.out.println(ch);  

//compareTo() method
System.out.println(name1.compareTo(name));

// concat() method
name1 = name1.concat("tpoint");
System.out.println(name1);

// contains() method
System.out.println(name1.contains("java"));

// endsWith() method
System.out.println(name1.endsWith("point"));

// startsWith() method
System.out.println(name1.startsWith("java"));

// equals() method
System.out.println(name1.equals(name));

// equalsIgnoreCase() method
System.out.println(name1.equalsIgnoreCase(name));
    
// format() method 
System.out.println(String.format("This is formatted String %s",name));

// indexOf() method
System.out.println(name1.indexOf("Java"));

// isEmpty() method
System.out.println(name1.isEmpty());

// join() method
name1 = name1.join(" ", "join","me");
System.out.println(name1);

// lastIndexOf() method
System.out.println(name1.lastIndexOf('a'));
System.out.println(name1.lastIndexOf("va"));
System.out.println(name1.lastIndexOf('a', 0));


// length() method
System.out.println(name1.length());


// replace() Method
System.out.println(name1.replace("a","o"));
System.out.println(name1.replace("Java","Kava"));

// replaceAll() method
System.out.println(name1.replaceAll("a","o"));

// split() method
String[] arr = name1.split("a");
System.out.println(Arrays.toString(arr));

// subString() method
name1 = name1.substring(2);
System.out.println(name1);

name1 = name1.substring(2,4);
System.out.println(name1);

// toCharArray() method
char[] chararr = name1.toCharArray();
System.out.println(Arrays.toString(chararr));

// toLowerCase() method
System.out.println(name1.toLowerCase());

// toUpperCase() Method
System.out.println(name1.toUpperCase());

// trim() method
System.out.println(name1.trim());

// valueOf() method
System.out.println(String.valueOf(10));

}}  
