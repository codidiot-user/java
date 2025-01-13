import java.util.*;
public class bethroted{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long num1=sc.nextLong();
        long num2=sc.nextLong();
        long sum1=0;
        long sum2=0;
        for(long i=1;i<num1;i++){
            if(num1%i==0){
                sum1+=i;
            }
        }for(long i=1;i<num2;i++){
            if(num2%i==0){
                sum2+=i;
            }
            }if(num1==sum2-1  && num2==sum1-1){
                System.out.println("yes");
    }else{
            System.out.println("no");
        }
                }
        }