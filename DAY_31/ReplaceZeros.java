public class ReplaceZeros {
    public static int replaceZerosWithOnes(int number) {
        int result = 0;
        int factor = 1;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                digit = 1;
            }
            result += digit * factor;
            factor *= 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 102030;
        int result = replaceZerosWithOnes(number);
        System.out.println("Number after replacing 0s with 1s: " + result);
    }
}
