class StringBasicExample{    
public static void main(String args[]){    
String s1="java";//creating string by Java string literal'
    
char ch[]={'s','t','r','i','n','g','s'};    
String s2=new String(ch);//converting char array to string
    
String s3=new String("example");//creating Java string by new keyword    
System.out.println(s1);    
System.out.println(s2);    
System.out.println(s3); 


s1.concat(" Language");//concat() method appends the string at the end but it does not change the s1 as it point to the java
System.out.println("Without changing pointer "+s1);
s1 = s1.concat(" Language"); // By changing pointer of s1 to newly created java object 
System.out.println("After changing pointer of s1 ti the new created java language object "+s1);

   
}}
