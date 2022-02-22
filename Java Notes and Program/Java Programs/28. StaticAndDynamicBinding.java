class StaticAndDynamicExample extends Animal{  
void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  StaticAndDynamicExample d1=new StaticAndDynamicExample(); // Example of Static binding  
  d1.eat();  

  Animal a = new StaticAndDynamicExample(); // Dynamic Binding
  a.eat();
 }  
}

class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}    
