class Adder{  

// With different number of parameters
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}

// With differnt type of parameter
static long add(int a,long b){return a+b;}   
}  
class OverloadingExample{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
System.out.println(Adder.add(11,12));  
}}  
