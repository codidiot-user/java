import java.util.*;
public class diamond{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    for(int row=1;row<num;row++){
      for(int col=row;col<num;col++){
        System.out.print(" ");
    }for(int col=1;col<=2*row-1;col++){
      System.out.print(num);
    }System.out.println();
    }for(int ro=num;ro>=1;ro--){
      for(int col=ro;col<num;col++){
        System.out.print(" ");
    }for(int col=1;col<=2*ro-1;col++){
      System.out.print(num);
    }System.out.println();
    }
  
    }
  }


   
