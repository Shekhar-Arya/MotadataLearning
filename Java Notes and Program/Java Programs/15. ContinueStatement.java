//Java Program to demonstrate the use of continue statement  
//inside the for loop.  
class ContinueExample {  
public static void main(String[] args) {  

// Simple continue statemnt
    //for loop  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            //using continue statement  
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
    }


System.out.println("-------------------------------");
// Labeled Continue statemnet  
          aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using continue statement with label  
                            continue aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }


}  
}  
