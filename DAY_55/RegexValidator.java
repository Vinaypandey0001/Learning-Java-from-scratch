import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int testCases = sc.nextInt();
        sc.nextLine();  // Consume the newline after the integer
        
        // Process each test case
        for (int i = 0; i < testCases; i++) {
            String pattern = sc.nextLine();
            
            // Try to compile the pattern and check for exceptions
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        
        sc.close();
    }
}
