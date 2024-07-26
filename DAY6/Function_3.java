// Program to Calculate sum of two number using function
import java.util.Scanner;

public class Function_3 {
    public static int CalculateSum(int a , int b){ // here i make function
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();

        int sum = CalculateSum(a, b); // it calculate/ pass numbers here 
        System.out.println("sum of two number is "+sum);
    }
}
