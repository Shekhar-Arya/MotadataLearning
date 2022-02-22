//Java Program to demonstrate the use of break statement    
//inside the for loop.  
class BreakExample {  
public static void main(String[] args) {  
    //using for loop  

// Simple break statement
    for(int i=1;i<=10;i++){  
        if(i==5){  
            //breaking the loop  
            break;  
        }  
        System.out.println(i);  
    }  


        System.out.println("--------------------------------------");
// Break statement with label
aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement with label  
                            break aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }  

  
}  
}
