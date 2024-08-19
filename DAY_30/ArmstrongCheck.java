public class ArmstrongCheck {
    public static boolean isArmstrong(int number) {
        int original = number, result = 0, digits = 0;

        while (original != 0) {
            original /= 10;
            digits++;
        }

        original = number;
        while (original != 0) {
            int digit = original % 10;
            result += Math.pow(digit, digits);
            original /= 10;
        }

        return result == number;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
