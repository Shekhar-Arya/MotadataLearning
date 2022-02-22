class A  
{  
    static int m=100;//static variable 
    int data1=80;//instance variable  
    void method()  
    {    
        int n=90;//local variable   
        System.out.println(" Local Variable "+n);   
    }  
    public static void main(String args[])  
    {  
        int data2=50;//instance variable
        System.out.println(" Static Variable "+m);
        System.out.println(" Instance Variable  "+data2);  
        A a = new A();
        a.method();
    
    }  
}//end of class
