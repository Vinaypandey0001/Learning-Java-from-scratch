import java.util.Arrays;

public class CircularRotation {
    // Method to rotate the array by K positions
    public static void rotateArray(int[] arr, int K) {
        int n = arr.length;
        // If K is greater than n, we take the remainder of K divided by n
        K = K % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first K elements
        reverse(arr, 0, K - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, K, n - 1);
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int K = 3;
        System.out.println("Original array: " + Arrays.toString(arr));

        rotateArray(arr, K);

        System.out.println("Array after rotating by " + K + " positions: " + Arrays.toString(arr));
    }
}
