public class SumInRange {
    public static int sumInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int result = sumInRange(start, end);
        System.out.println("Sum from " + start + " to " + end + " is: " + result);  // Output: 15
    }
}
