import java.util.*;
public class odd{
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if(i%2!=0)
            sum += i;
    }System.out.println(sum);
}}