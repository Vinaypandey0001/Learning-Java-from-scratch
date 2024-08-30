public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposedMatrix = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transposed = transpose(matrix);
        
        System.out.println("Transposed matrix:");
        for (int[] row : transposed) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        // Output:
        // 1 4 
        // 2 5 
        // 3 6 
    }
}
