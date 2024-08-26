public class MaxMinInArray {
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        findMaxMin(arr); 
        // Output: Maximum element: 12
        //         Minimum element: -1
    }
}
