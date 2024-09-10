import java.util.Scanner;

public class Solution_Hackerrank_12 {
    
    public static String getSmallestAndLargest(String s, int k) {
        // Step 1: Initialize smallest and largest with the first substring
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Step 2: Iterate over all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            // Step 3: Update smallest and largest if needed
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        // Step 4: Return the result
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        
        // Call the function and print the result
        System.out.println(getSmallestAndLargest(s, k));
    }
}
