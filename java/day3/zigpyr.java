import java.util.Scanner;

public class zigpyr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
