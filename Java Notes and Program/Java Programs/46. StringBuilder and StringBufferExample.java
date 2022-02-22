class StringBufferAndStringBuilderExample{  
public static void main(String args[]){  

//StringBuffer

System.out.println("----------------------------\nStringBuffer Example");

// Creating String usig StringBuffer
StringBuffer sb=new StringBuffer("Hello "); 

// Append Method Example 
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  

// Insert Method Example
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello  

// Replace Method Example
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo  

// Delete Method Example
sb.delete(1,3);  
System.out.println(sb);//prints Hlo  

// Reverse Method Example
sb.reverse();  
System.out.println(sb);//prints olleH  

// Length method Example
System.out.println(sb.length());  

System.out.println("----------------------------\nStringBuilder Example");  

// StringBuilder Example

// Creating String usig StringBuilder
StringBuilder sb1=new StringBuilder("Hello"); 

// Append Method Example 
sb1.append("Java");//now original string is changed  
System.out.println(sb1);//prints Hello Java  

// Insert Method Example
sb1.insert(1,"Java");//now original string is changed  
System.out.println(sb1);//prints HJavaello  

// Replace Method Example
sb1.replace(1,3,"Java");  
System.out.println(sb1);//prints HJavalo  

// Delete Method Example
sb1.delete(1,3);  
System.out.println(sb1);//prints Hlo  

// Reverse Method Example
sb1.reverse();  
System.out.println(sb1);//prints olleH  

// Length method Example
System.out.println(sb1.length());  



// Both Also include substring(int start index) and substring(int start index, int end index) method


// We cant compare two StringBuilder and StringBuffer object with equals below Will show false even the content of the both are same
StringBuilder sb2=new StringBuilder("Hello");
System.out.println(sb1.equals(sb2));

// We can compare them as below
System.out.println(sb1.toString().equals(sb2.toString()));

}  
}  
