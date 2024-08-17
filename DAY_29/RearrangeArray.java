import java.util.Arrays;

public class RearrangeArray {

    public static void rearrangeArray(int[] arr) {
        Arrays.sort(arr); // Sort the array in increasing order
        int n = arr.length;
        int[] result = new int[n];

        // Fill the result array in increasing-decreasing order
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            result[index++] = arr[i];
            result[index++] = arr[n - i - 1];
        }
        if (n % 2 != 0) {
            result[index] = arr[n / 2];
        }

        // Copy back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        rearrangeArray(arr);
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}
