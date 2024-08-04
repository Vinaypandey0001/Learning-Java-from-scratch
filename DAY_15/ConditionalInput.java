import java.util.Scanner;

public class ConditionalInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter text (type 'exit' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("You entered: " + input);
        }

        System.out.println("Program terminated.");
    }
}
