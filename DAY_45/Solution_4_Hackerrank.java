import java.util.Scanner;

public class Solution_4_Hackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the integer
        int i = scanner.nextInt();
        
        // Reading the double
        double d = scanner.nextDouble();
        
        // Reading the rest of the line for the string input
        scanner.nextLine(); // Consume the leftover newline character
        String s = scanner.nextLine();
        
        // Printing the values in the required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scanner.close();
    }
}
