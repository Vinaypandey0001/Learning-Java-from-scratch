import java.util.*;
class UserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        System.out.println("Enter first number");
        num1= sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Entered numbers are  " +num1 + " and " +num2);

        sc.close();
    }
}
