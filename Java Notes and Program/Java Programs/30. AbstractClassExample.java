//Example of an abstract class that has abstract and non-abstract methods  
 abstract class Bike{  
   Bike(){System.out.println("bike is created");} // Constructor  
   abstract void run();                           // Abstract class
   void changeGear(){System.out.println("gear changed");}  // Non-Abstract Class
 }  

//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
Honda(){super();}
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class AbstractionClassExample{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
