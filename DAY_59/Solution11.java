import java.util.Scanner;

public class Solution11 {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the integer n (size of the array)
        int n = sc.nextInt();
        
        // Create an array of size n
        int[] arr = new int[n];
        
        // Read n integers and store them in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Temporary print statement for debugging (remove this if the locked code works)
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        // Close the scanner
        sc.close();
    }
}
