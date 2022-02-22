interface Printable{  // Example of Interface
void print();  
}  
interface Showable{  
void show();  
}  

interface Showable1{  
void print();           // Same methods in different interface but no ambuiguty because its implemntation is provided by class

default void msg(){System.out.println("default method");}  // Default methods with body
static int cube(int x){return x*x*x;}                      // Static methods with body
}  


class InterfaceExample implements Printable,Showable,Showable1{  // Example of Multiple inheritance with implementation of interfaces
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
InterfaceExample obj = new InterfaceExample();  
obj.print();  
obj.show();  
obj.msg();
System.out.println(Showable1.cube(3));
 }  
}  
