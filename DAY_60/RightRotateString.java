import java.util.Scanner;

public class RightRotateString {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read the string S
        String S = scanner.nextLine();

        // Read the integer N
        int N = scanner.nextInt();

        // Ensure N is within the bounds of the string's length
        N = N % S.length();  // To handle cases where N is greater than the length of the string

        // Perform the right rotation using substring
        String rotatedString = S.substring(S.length() - N) + S.substring(0, S.length() - N);

        // Print the rotated string
        System.out.println(rotatedString);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
