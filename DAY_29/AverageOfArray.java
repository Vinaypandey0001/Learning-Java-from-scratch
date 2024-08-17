public class AverageOfArray {

    public static double averageOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        double average = averageOfArray(arr);
        System.out.println("Average of the array: " + average);
    }
}
