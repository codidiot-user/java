import java.util.Scanner;
public class numseparasum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num1=sc.nextLong();
        long quo;
        long sum=0;
        long count=0;
        while(num1>0){
            quo=num1%10;
            num1=num1/10;
            sum+=quo;
            count+=1;
            }System.out.println(sum);
            System.out.println(count);
        }
    }
