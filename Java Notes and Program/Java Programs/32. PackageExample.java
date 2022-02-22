package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  

// package mypack;  
// import pack.*; One way to use different package class or interfaces
// import pack.A;  Anoter way to import
//   pack.A obj = new pack.A();//using fully qualified name  third way to use 
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  
