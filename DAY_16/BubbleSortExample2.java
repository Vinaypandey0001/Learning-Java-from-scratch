import java.util.Scanner;

public class BubbleSortExample2 {
    public static int bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }

            if (!swapped) break;
        }

        return swapCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int swapCount = bubbleSort(array);

        System.out.println("\nAfter sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nNumber of swaps: " + swapCount);
    }
}
