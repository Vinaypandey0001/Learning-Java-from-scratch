public class SumOfTwoPrimes {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean canBeSumOfTwoPrimes(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " = " + i + " + " + (number - i));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 34;
        if (!canBeSumOfTwoPrimes(number)) {
            System.out.println(number + " cannot be expressed as a sum of two prime numbers.");
        }
    }
}
