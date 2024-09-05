import java.util.Scanner;

public class Solution_7_Hackerrank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();  // Number of queries
        
        // Loop through each query
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();  // Read a
            int b = sc.nextInt();  // Read b
            int n = sc.nextInt();  // Read n (number of terms)
            
            int sum = a;  // Initialize the sum with 'a'
            
            // Loop to calculate the series and print the terms
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;  
                System.out.print(sum + " ");  
            }
            
            System.out.println();  // Move to the next line after printing the series
        }
        
        sc.close();  // Close the scanner
    }
}
