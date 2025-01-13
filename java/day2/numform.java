import java.util.Scanner;
public class numform{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num1=sc.nextLong();
        long quo;
        while(num1>0){
            quo=num1%10;
            System.out.print(quo);
            num1=num1/10;
            
        }
        }
    }
