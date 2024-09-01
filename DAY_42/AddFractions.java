public class AddFractions {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void addFractions(int num1, int denom1, int num2, int denom2) {
        int commonDenom = denom1 * denom2;
        int numSum = (num1 * denom2) + (num2 * denom1);
        int gcd = gcd(numSum, commonDenom);
        
        int resultNum = numSum / gcd;
        int resultDenom = commonDenom / gcd;

        System.out.println("Sum of fractions: " + resultNum + "/" + resultDenom);
    }

    public static void main(String[] args) {
        int num1 = 1, denom1 = 2;  // 1/2
        int num2 = 3, denom2 = 4;  // 3/4
        addFractions(num1, denom1, num2, denom2);  // Output: 5/4
    }
}
