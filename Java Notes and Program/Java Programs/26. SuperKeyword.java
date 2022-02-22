class Animal{  
String color="white";  
void eat(){System.out.println("eating...");}  
Animal(){System.out.println("animal is created");}  

}  
class Dog extends Animal{  

String color="black";

//super is used to refer immediate parent class instance variable.
// Using super keyword to hide the variable of parent class.  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
} 


// super can be used to invoke parent class method 
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}

Dog(){  
super();  
System.out.println("dog is created");  
}  


}  

class SuperExample{  
public static void main(String args[]){  

Dog d=new Dog();  
d.printColor();  
d.work();
}} 
