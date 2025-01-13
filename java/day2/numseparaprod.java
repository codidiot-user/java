import java.util.Scanner;
public class numseparaprod{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num1=sc.nextLong();
        long quo;
        long sum=1;
        while(num1>0){
            quo=num1%10;
            num1=num1/10;
            sum*=quo;
            
            }System.out.print(sum);
        }
    }
