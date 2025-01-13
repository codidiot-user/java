import java.util.*;
public class withoutm{
    public static void main (String[]agrs){
        Scanner sc = new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(int i=1; i<=num2;i++){
            sum+=num1;
        }System.out.print(sum);
    }
}