import java.util.Scanner;

public class StringTokenSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string
        String input = sc.nextLine();
        
        // Use regular expression to split on non-alphabetic characters
        String[] tokens = input.split("[^A-Za-z]+");
        
        // Remove empty strings from the result
        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }
        
        // Print the number of tokens
        System.out.println(count);
        
        // Print each token
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        
        sc.close();
    }
}
