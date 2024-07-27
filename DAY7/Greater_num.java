// Program to  print the greater number using Function @vinaypandey0001

import java.util.Scanner;

public class Greater_num {
    public static int greaterOfTwo(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("The greater number is: " + greaterOfTwo(num1, num2));
        
        scanner.close();
    }
}
