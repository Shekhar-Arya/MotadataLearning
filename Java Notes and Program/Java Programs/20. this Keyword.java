class Student{  
int rollno;  
String name;  
float fee;  


Student(int rollno,String name,float fee){ 

// this() : to invoke current class constructor
this();

// this: to refer current class instance variable 
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  

Student(){System.out.println("Hello from constructor");}

void display(){System.out.println(rollno+" "+name+" "+fee);} 


void m(){ 
// this: to invoke current class method
this.display();} 
}  


class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s1.m();
s2.display();
}}  
