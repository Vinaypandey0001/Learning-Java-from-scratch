public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 10};

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
