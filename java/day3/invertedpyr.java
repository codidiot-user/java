import java.util.*;
public class invertedpyr{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    for(int row=num;row>=1;row--){
      for(int col=row;col<num;col++){
        System.out.print(" ");
    }for(int col=1;col<=2*row-1;col++){
      System.out.print("*");
    }System.out.println();
  }
}
}