public class MagicSquare {
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sumDiagonal1 = 0, sumDiagonal2 = 0;
        
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];
            sumDiagonal2 += matrix[i][n - 1 - i];
        }
        
        if (sumDiagonal1 != sumDiagonal2) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != sumDiagonal1 || colSum != sumDiagonal1) {public class MagicSquare {
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sumDiagonal1 = 0, sumDiagonal2 = 0;
        
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];
            sumDiagonal2 += matrix[i][n - 1 - i];
        }
        
        if (sumDiagonal1 != sumDiagonal2) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != sumDiagonal1 || colSum != sumDiagonal1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        boolean result = isMagicSquare(matrix);
        System.out.println("Is magic square: " + result);  // Output: true
    }
}

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        boolean result = isMagicSquare(matrix);
        System.out.println("Is magic square: " + result);  // Output: true
    }
}
