import java.util.Scanner;

public class ReadAndPrintString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }
}
