public class AddFractions {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void addFractions(int num1, int den1, int num2, int den2) {
        int lcm = (den1 * den2) / gcd(den1, den2);
        int sumNum = (num1 * (lcm / den1)) + (num2 * (lcm / den2));

        int gcdSum = gcd(sumNum, lcm);

        System.out.println("Sum of fractions: " + (sumNum / gcdSum) + "/" + (lcm / gcdSum));
    }

    public static void main(String[] args) {
        int num1 = 1, den1 = 3;
        int num2 = 2, den2 = 5;

        addFractions(num1, den1, num2, den2);
    }
}
