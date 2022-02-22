import java.util.*;  

class SubstringExaple{    
 public static void main(String args[]){    
 String s="Sachin Tendulkar";    
 System.out.println("Original String: " + s);  
// Getting substring using substring method 
System.out.println("Substring starting from index 6: " +s.substring(7));//Tendulkar    
 
System.out.println("Substring starting from index 0 to 6: "+s.substring(0,7)); //Sachin  

 
// Creating substring using split method
String[] sentences = s.split(" ");  
System.out.println(Arrays.toString(sentences));  

 }  
}    

