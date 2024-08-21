public class LCM {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 36, num2 = 60;
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}
