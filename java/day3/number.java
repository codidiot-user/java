import java.util.*;
public class number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        long num=sc.nextLong();
        for(long row=1;row<=num;row++){
            for (char col='A';col<='Z';col++){
                // System.out.print(row);
                System.out.print(col);
                    }      
        System.out.println();
        }
    }
}