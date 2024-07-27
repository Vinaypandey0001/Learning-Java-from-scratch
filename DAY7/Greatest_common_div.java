// program to find greatest common divisor @vinaypandey0001
import java.util.Scanner;

    public class Greatest_common_div {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("The GCD is: " + gcd(num1, num2));
        
        scanner.close();
    }
}

