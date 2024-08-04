import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double value = scanner.nextDouble();
        System.out.println("You entered: " + value);
    }
}
