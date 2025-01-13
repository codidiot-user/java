import java.util.*;
public class faca{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long temp=num;
        long count=0;
        long result=0;
        long power=1;
        System.out.print(result==arms(num, temp, count, result, power));
    }public static long arms(long num, long temp, long count, long result, long power){
        while(num>0){
            long digit=num%10;
            num=num/10;
            count+=1;
            for(long ro=1;ro<=digit;ro++){
                power*=digit;
            }result+=power;
            temp/=10;

        }return result;
    }
}