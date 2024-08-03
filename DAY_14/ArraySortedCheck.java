import java.util.Scanner;

public class ArraySortedCheck {

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

        // Check if array is sorted in ascending order
        boolean sorted = true;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                sorted = false;
                break;
            }
        }

        // Print result
        if (sorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}
