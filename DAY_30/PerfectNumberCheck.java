public class PerfectNumberCheck {
    public static boolean isPerfect(int number) {
        int sum = 1;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number && number != 1;
    }

    public static void main(String[] args) {
        int number = 28;
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
