//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class Counter2{  
// Static variable
static int count=0;//will get memory only once and retain its value  

// Static method
static int cube(int x){  
  return x*x*x;  
  }  

// Static Block
  static{System.out.println("static block is invoked");} 

Counter2(){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//creating objects  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  

int result=Counter2.cube(5);  
System.out.println(result);  

}  
} 	
