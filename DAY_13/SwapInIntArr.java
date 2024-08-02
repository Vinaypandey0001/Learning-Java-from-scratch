public class SwapInIntArr {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index1 = 1; // Index of the first element (20)
        int index2 = 3; // Index of the second element (40)

        // Print original array
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Swap elements at index1 and index2
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        // Print array after swapping
        System.out.println("\nArray After Swapping:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
