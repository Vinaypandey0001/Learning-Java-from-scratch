import java.util.Scanner;

public class Solution_HC_11 {
    public static void main(String[] args) {
        // Step 1: Read input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Step 2: Extract and print the substring (inclusive of 'start' and 'end')
        System.out.println(s.substring(start, end + 1));
    }
}
