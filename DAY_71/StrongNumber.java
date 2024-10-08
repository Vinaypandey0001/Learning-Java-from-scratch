import java.util.Scanner;

public class StrongNumber {
    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;    // Extract the last digit
            sum += factorial(digit); // Add factorial of the digit to the sum
            num /= 10;               // Remove the last digit
        }

        // Check if sum of factorials of digits is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isStrong(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
}
