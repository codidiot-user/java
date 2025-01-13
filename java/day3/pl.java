import java.util.*;
public class pl{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        for(long row=1;row<=num;row++){
            for (long col=1;col<=num;col++){
                if(row==(num+2)/2 || col==(num+2)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    }      
        System.out.println();
        }
    }
}