import java.util.Scanner;

public class Solution_hc_10 {
    public static void main(String[] args) {
        // Step 1: Read input strings
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Step 2: Print the sum of the lengths of A and B
        System.out.println(A.length() + B.length());

        // Step 3: Check lexicographic order
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Step 4: Capitalize the first letter of both strings
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Step 5: Print the capitalized strings
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
