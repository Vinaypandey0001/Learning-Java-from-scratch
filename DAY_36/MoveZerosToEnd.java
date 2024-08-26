public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int j = 0; // index to place non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        while (j < arr.length) {
            arr[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZeros(arr);
        System.out.println("Array after moving zeros to end: " + java.util.Arrays.toString(arr));
        // Output: [1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0, 0]
    }
}
