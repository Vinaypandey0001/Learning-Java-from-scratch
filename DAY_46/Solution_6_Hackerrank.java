import java.util.Scanner;

public class Solution_6_Hackerrank {
    public static void main(String[] args) {
        int i, n, result;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // Loop to print the first 10 multiples of n
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
        sc.close();  
    }
}
