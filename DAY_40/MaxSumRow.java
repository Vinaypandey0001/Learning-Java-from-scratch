public class MaxSumRow {
    public static int rowWithMaxSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {9, 8, 7}
        };
        int rowIndex = rowWithMaxSum(matrix);
        System.out.println("Row with maximum sum: " + rowIndex);  // Output: 2
    }
}
