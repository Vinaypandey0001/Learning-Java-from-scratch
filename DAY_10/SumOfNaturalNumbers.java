// Program to print sum of natural numbers @vinaypandey0001 
public class SumOfNaturalNumbers {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Sum of first " + number + " natural numbers is " + sum(number));
    }
}
