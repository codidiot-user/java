import java.util.*;
public class arrow{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int row=1;row<=num;row++){
      for(int col=1;col<=row;col++){
        System.out.print("*");
  }System.out.println();
}
    for(int row=num;row>=1;row--){
        for(int col=1;col<=row;col++){
            System.out.print("*");
        }System.out.println();
}
  }
}