//Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line  

class Testarray1{  

public static void main(String args[]){  

int b[]=new int[5];//declaration and instantiation 
int a[]={33,3,4,5};//declaration, instantiation and initialization 
//new int[]{33,3,4,5};// Example of Anonymous array

int c[][] = new int[1][1];// Multi Dimensional Array
int arr[][] = new int[3][]; // Jagged Array  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
 
// Copying Array using System class
int d[] = new int[3];
System.arraycopy(a,0,d,0,3);

// Cloning the array using clone() method
int e[] = d.clone();

//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  

// Using ForEach loop to traverse the array
for(int i : a)
{
System.out.println(i);
}

}}  
