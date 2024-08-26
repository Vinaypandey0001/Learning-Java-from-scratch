public class SecondLargestInArray {
    public static int findSecondLargest(int[] arr) {
        int firstLargest, secondLargest;
        firstLargest = secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargest(arr);
        System.out.println("Second Largest element: " + result); // Output: 34
    }
}
