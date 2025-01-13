import java.util.*;
public class evenwhile{
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;
        while( i <= N){
            sum += i;
            i++;
    }System.out.println(sum);
}
}