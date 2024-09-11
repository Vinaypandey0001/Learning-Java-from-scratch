import java.util.Scanner;

public class Deloitte_ {

    public static void main(String[] args) {

        // Read input from STDIN
        Scanner sc = new Scanner(System.in);
        
        // Get the integer input
        int N = sc.nextInt();
        
        // Convert integer to String
        String strN = Integer.toString(N);
        
        // Get the length of the string representation of the number
        int num = strN.length();
        
        // Print the original number first
        System.out.print(N + " ");
        
        // Loop to generate rotated numbers
        for (int i = 1; i < num; i++) {
            // Create rotated string by shifting characters
            String rotatedStr = strN.substring(i) + strN.substring(0, i);
            // Convert rotated string back to integer
            int rotatedNum = Integer.parseInt(rotatedStr);
            
            // Output the rotated number if it is greater than 0
            if (rotatedNum > 0) {
                System.out.print(rotatedNum + " ");
            }
        }

        // Close the scanner
        sc.close();
    }
}
