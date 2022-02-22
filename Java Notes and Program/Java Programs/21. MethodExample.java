class MethodExample   
{  

private int x =0;


// Getter method
public int getX()
{
return x;
}


// Setter Method
public void setX(int x)
{
this.x = x;
}

public static void main(String[] args)   
{  
int a = 19;  
int b = 5;

MethodExample me = new MethodExample();

// Calling getter and setter method
me.setX(10);
System.out.println("This is from getter method "+me.getX());
  
//method calling of static method  
int c = add(a, b);   //a and b are actual parameters  
System.out.println("The sum of a and b is= " + c);  

//method calling of instance method
int d = me.sub(a,b);
System.out.println("The sub of a and b is= " + d);

}  
//user defined method Static method
public static int add(int n1, int n2)   //n1 and n2 are formal parameters  
{  
int s;  
s=n1+n2;  
return s; //returning the sum  
}  

// user defined instance method
public int sub(int n1, int n2)   //n1 and n2 are formal parameters  
{  
int s;  
s=n1-n2;  
return s; //returning the sum  
}


// Abstract method are method without body which are either in abstract class or interface.

} 
