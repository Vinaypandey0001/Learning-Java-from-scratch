import java.util.Scanner;

public class ArrayElementCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare array
        int[] array = new int[size];

        // Input elements of the array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input element to count occurrences
        System.out.print("Enter the element to count occurrences: ");
        int element = scanner.nextInt();

        // Count occurrences of the element
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                count++;
            }
        }

        // Print number of occurrences
        System.out.println("Occurrences of " + element + " in the array: " + count);
    }
}
