import java.util.Scanner;

public class ArrayReverse {

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

        // Reverse the array
        System.out.println("Reversed array:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
