public class ContinueWhileExample {  
public static void main(String[] args) {  
    //while loop  
    int i=1;  
    while(i<=10){  
        if(i==5){  
            //using continue statement  
            i++;  
            break;//it will skip the rest statement  
        }  
        System.out.println(i);  
        i++;  
    }  
}  
}  