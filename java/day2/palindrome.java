import java.util.*;
public class palindrome{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        long num=sc.nextLong();
        long pal=num; 
        long result=0;
        long quo;
        while(num>0){
            quo=num%10;
            num=num/10;
            result=result*10+ quo;
        }
        if(pal==result){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        }
}