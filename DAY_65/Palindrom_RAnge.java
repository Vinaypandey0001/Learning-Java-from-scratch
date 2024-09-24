import java.util.Scanner;

public class Palindrom_RAnge {
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int original = n;  // Store the original number
        int reversed = 0;
        int temp = n;      // Temporary variable for manipulation
        
        // Reverse the number
        while (temp != 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp = temp / 10;
        }
        
        // Check if original number is equal to the reversed number
        return original == reversed;
    }

    // Function to print all palindromes in a given range
    public static void printPalindromesInRange(int min, int max) {
        System.out.println("Palindromes between " + min + " and " + max + " are:");
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input minimum and maximum range from the user
        System.out.print("Enter the minimum range: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum range: ");
        int max = sc.nextInt();

        // Print all palindromes in the given range
        printPalindromesInRange(min, max);

        sc.close();
    }
}
