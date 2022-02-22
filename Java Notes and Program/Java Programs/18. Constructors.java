//Let us see another example of default constructor  
//which displays the default values  
class Student3{  
int id;  
String name;  

// It also shows the constructor Overloading

// No args Constructor
Student3(){}  

// Parameterized Constructor
Student3(int i,String n){  
    id = i;  
    name = n;  
    }  

//method to display the value of id and name  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  

// Default Constructor (No-Args Constructor)
//creating objects  
Student3 s1=new Student3();  
Student3 s2=new Student3();  
//displaying values of the object  
s1.display();  
s2.display();  


// Parameterized Constructor
//creating objects and passing values  
    Student3 s3 = new Student3(111,"Karan");  
    Student3 s4 = new Student3(222,"Aryan");
    //calling method to display the values of object  
    s3.display();  
    s4.display();  

}  
}  

