import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number N to find the sum of the first N natural numbers: ");
        int N = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= N; i++) {
            sum *= i; 
            System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
        }
        
    }
}
