public class SwapElementsInDoubleArray {
    public static void main(String[] args) {
        double[] values = {1.1, 2.2, 3.3, 4.4};
        int index1 = 1; // Index of the first element (2.2)
        int index2 = 2; // Index of the second element (3.3)

        // Print original array
        System.out.println("Original Array:");
        for (double value : values) {
            System.out.print(value + " ");
        }

        // Swap elements at index1 and index2
        double temp = values[index1];
        values[index1] = values[index2];
        values[index2] = temp;

        // Print array after swapping
        System.out.println("\nArray After Swapping:");
        for (double value : values) {
            System.out.print(value + " ");
        }
    }
}
