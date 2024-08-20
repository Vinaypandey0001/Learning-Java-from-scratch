public class Permutations {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        int n = 5; // Number of people
        int r = 3; // Number of seats

        int permutations = permutation(n, r);
        System.out.println("Number of permutations: " + permutations);
    }
}
