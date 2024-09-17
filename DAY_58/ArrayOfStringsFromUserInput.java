import java.util.Scanner;

public class ArrayOfStringsFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        String[] words = new String[size];

        System.out.println("Enter " + size + " words:");
        for (int i = 0; i < size; i++) {
            words[i] = scanner.nextLine();
        }

        System.out.println("Array elements:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
