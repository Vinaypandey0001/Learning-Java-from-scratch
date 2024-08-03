import java.util.Scanner;

public class ArrayMaxElement {

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

        // Find maximum element in array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print maximum element
        System.out.println("Maximum element in the array: " + max);
    }
}
