import java.util.*;

public class on {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong(); // Input from the user
        long result = arms(num);  // Call the arms method to calculate

        if (result == num) { // Compare the result with the original number
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close(); // Close the scanner
    }

    public static long arms(long num) {
        long count = 0;
        long temp = num;
        long result = 0;

        // Calculate the number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;

        // Calculate the sum of digits raised to the power of 'count'
        while (temp > 0) {
            long digit = temp % 10;
            long power = 1;

            // Compute digit^count manually
            for (long i = 0; i < count; i++) {
                power *= digit;
            }

            result += power;
            temp /= 10;
        }

        return result;
    }
}
