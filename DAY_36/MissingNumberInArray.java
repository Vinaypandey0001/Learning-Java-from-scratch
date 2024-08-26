public class MissingNumberInArray {
    public static int findMissingNumber(int[] arr, int n) {
        int sumOfN = n * (n + 1) / 2;
        int sumOfArray = 0;

        for (int num : arr) {
            sumOfArray += num;
        }

        return sumOfN - sumOfArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8; // The array should contain numbers from 1 to 8
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number: " + missingNumber); // Output: 5
    }
}
