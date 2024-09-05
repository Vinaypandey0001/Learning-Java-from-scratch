import java.util.Scanner;

public class Solution_5_Hackerrank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Printing the top border of the output
        System.out.println("================================");
        
        // Looping three times to take inputs and print formatted output
        for(int i=0; i<3; i++){
            String s = sc.next();
            int x = sc.nextInt();
            
            // Format: Left-justify the string in 15 characters and pad integer to 3 digits with leading zeroes
            System.out.printf("%-15s%03d%n", s, x);
        }
        
        // Printing the bottom border of the output
        System.out.println("================================");
    }
}
