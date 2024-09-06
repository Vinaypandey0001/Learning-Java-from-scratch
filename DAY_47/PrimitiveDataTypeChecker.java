import java.util.Scanner;

public class PrimitiveDataTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");

                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // All long values can fit in a 'long'
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
