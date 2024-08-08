public class ArraySum {
    public static int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sum(array, array.length));
    }
}
