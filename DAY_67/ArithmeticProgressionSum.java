import java.util.Scanner;

public class ArithmeticProgressionSum {
    
    // Method to calculate the sum of an AP series
    public static int calculateAPSum(int n, int a, int d) {
        // Using the formula: S_n = n/2 * (2a + (n-1) * d)
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: n (number of terms), a (first term), d (common difference)
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();

        // Calculate the sum of the AP series
        int result = calculateAPSum(n, a, d);

        // Output the result
        System.out.println("Sum of the AP series: " + result);

        scanner.close();
    }
}
