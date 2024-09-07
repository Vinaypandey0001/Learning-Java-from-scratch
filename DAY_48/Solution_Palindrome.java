import java.util.Scanner;

public class Solution_Palindrome {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String s = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Check if the string is a palindrome
        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // Reverse the string and compare it to the original
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
