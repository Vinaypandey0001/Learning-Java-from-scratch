public class SumOfArray {

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int sum = sumOfArray(arr);
        System.out.println("Sum of the array: " + sum);
    }
}
