import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the integer input
        
        // Convert the integer to string
        String s = Integer.toString(n);
        
        // Check if the conversion is successful
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
