 class LogicalAndBitwiseOperatorExample{  
public static void main(String args[]){  

// Java AND Operator Example: Logical && vs Bitwise &

int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a);//11 because second condition is checked  

System.out.println("--------------------------------------------");

//Java OR Operator Example: Logical || and Bitwise |

a=10;  
b=5;  
c=20;  
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
}}  
