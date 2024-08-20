public class QuadraticEquationRoots {
    public static void findRoots(double a, double b, double c) {
        double determinant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(Math.abs(determinant));

        if (determinant > 0) {
            System.out.println("Roots are real and different.");
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (determinant == 0) {
            System.out.println("Roots are real and the same.");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + -b / (2 * a) + " + i" + sqrt / (2 * a));
            System.out.println("Root 2: " + -b / (2 * a) + " - i" + sqrt / (2 * a));
        }
    }

    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        findRoots(a, b, c);
    }
}
