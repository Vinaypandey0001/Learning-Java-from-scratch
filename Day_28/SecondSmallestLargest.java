import java.util.Arrays;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 10};

        Arrays.sort(arr);

        int secondSmallest = arr[1];
        int secondLargest = arr[arr.length - 2];

        System.out.println("The second smallest element is: " + secondSmallest);
        System.out.println("The second largest element is: " + secondLargest);
    }
}
