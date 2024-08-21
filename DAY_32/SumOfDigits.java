public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12345; // Example number
        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits(num));
    }
}
