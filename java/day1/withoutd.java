import java.util.*;
public class withoutd{
    public static void main (String[]agrs){
        Scanner sc = new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(sum=0;num1>=num2;sum++){
            num1=num1-num2;
        }System.out.print(sum);
    }

}