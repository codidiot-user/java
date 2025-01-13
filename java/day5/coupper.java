import java.util.*;
public class coupper{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count+=1;
                
            }
        }
        System.out.println("Uppercase count= "+count);
        System.out.println(str);
    }
}