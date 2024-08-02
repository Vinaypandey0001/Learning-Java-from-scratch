// Program to print Fibonacci series @vinaypandey0001
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Fibonacci number " + number + " is " + fibonacci(number));
    }
}
