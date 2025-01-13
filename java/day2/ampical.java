
import java.util.Scanner;

 public class ampical{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);{
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
            }if (num1==sum2 && num2==sum1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
 }