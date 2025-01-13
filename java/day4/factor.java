import java.util.*;
public class factor{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        System.out.print(facto(num,count));
    }
    public static int facto(int num, int count){
        for(int ro=1; ro<=num; ro++){
            if(num%ro==0){
                count+=1;
                
            }
        } 
        return count;
    }
}