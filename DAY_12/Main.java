import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean saveAll(int[] a, int[] b, int n) {
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Check if each patient can be cured by a corresponding vaccine
        for (int i = 0; i < n; i++) {
            if (a[i] <= b[i]) {
                return false; // If any vaccine strength is not greater than corresponding patient's midichlorians, return false
            }
        }
        return true; // All patients can be cured
    }

    // Do not edit this part of code 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < n; i++)
            b[i] = scanner.nextInt();

        if (saveAll(a, b, n))
            System.out.println("Yes");
        else
            System.out.println("No");

        scanner.close();
    }
}
