import java.util.Scanner;
public class numform2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num1=sc.nextLong();
        long quo;
        long result=0;
        while(num1>0){
            quo=num1%10;
            num1=num1/10;
            result=result*10+quo;
        }System.out.print(result);
        }
    }
