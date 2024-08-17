import java.util.Arrays;

public class MedianOfArray {

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        double median = findMedian(arr);
        System.out.println("Median of the array: " + median);
    }
}
