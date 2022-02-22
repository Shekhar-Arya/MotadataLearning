class StringConcatenation{  
 public static void main(String args[]){ 

   // String Concatination using + Operator 
   String s=50+30+"Sachin"+40+40;  
   System.out.println(s);//80Sachin4040  

System.out.println("------------------------------");

    // Sting Concatination using concat method.
    String s1="Sachin ";  
   String s2="Tendulkar";  
   String s3=s1.concat(s2);  
   System.out.println(s3);//Sachin Tendulkar  

System.out.println("------------------------------");

    // Strin concatination using StringBuilder append() Method
         StringBuilder s4 = new StringBuilder("Hello");    //String 1  
         StringBuilder s5 = new StringBuilder(" World");    //String 2  
         StringBuilder s6 = s4.append(s5);   //String 3 to store the result  
         System.out.println(s6);  //Displays result 

System.out.println("------------------------------");

    // String concatination using format method of String Class
    String s11 = new String("Hello");    //String 1  
        String s22 = new String(" World");    //String 2  
        String s33 = String.format("%s%s",s11,s22);   //String 3 to store the result  
            System.out.println(s33.toString());  //Displays result  

System.out.println("------------------------------");
 
    // String Concatination using join method
     String s111 = new String("Hello");    //String 1  
        String s222 = new String(" World");    //String 2  
        String s333 = String.join("",s111,s222);   //String 3 to store the result  
            System.out.println(s333.toString());  //Displays result  
    
 }  
}  
