public class SmallestElement1 {
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 10};

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The smallest element is: " + smallest);
    }
}
