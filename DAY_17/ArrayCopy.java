public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        // Copying array
        System.arraycopy(original, 0, copy, 0, original.length);

        // Printing copied array
        for (int i = 0; i < copy.length; i++) {
            System.out.println("Element at index " + i + ": " + copy[i]);
        }
    }
}
