import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
