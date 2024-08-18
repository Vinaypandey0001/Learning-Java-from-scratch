public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 10};

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element is: " + largest);
    }
}
