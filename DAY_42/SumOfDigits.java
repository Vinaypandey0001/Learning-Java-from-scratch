public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits: " + result);  // Output: 15
    }
}
