import java.util.Scanner;

public class ArraySum {

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

        // Calculate sum of array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Print sum of array elements
        System.out.println("Sum of elements in the array: " + sum);
    }
}
