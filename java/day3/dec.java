import java.util.*;
public class dec{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        for(long row=num;row>=1;row--){
            for (long col=1;col<=row;col++){
                System.out.print("*");
                    }      
        System.out.println();
        }
    }
}