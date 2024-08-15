//Strassen's algorithm is an advanced method to multiply two matrices more efficiently than the naive approach. @vinaypandey0001
public class StrassenMatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] C = multiply(A, B);
        System.out.println("Product of matrices:");
        printMatrix(C);
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int m = n / 2;
        int[][] A11 = new int[m][m];
        int[][] A12 = new int[m][m];
        int[][] A21 = new int[m][m];
        int[][] A22 = new int[m][m];
        int[][] B11 = new int[m][m];
        int[][] B12 = new int[m][m];
        int[][] B21 = new int[m][m];
        int[][] B22 = new int[m][m];

        // Dividing matrices into quadrants
        divide(A, A11, A12, A21, A22);
        divide(B, B11, B12, B21, B22);

        int[][] M1 = multiply(add(A11, A22), add(B11, B22));
        int[][] M2 = multiply(add(A21, A22), B11);
        int[][] M3 = multiply(A11, subtract(B12, B22));
        int[][] M4 = multiply(A22, subtract(B21, B11));
        int[][] M5 = multiply(add(A11, A12), B22);
        int[][] M6 = multiply(subtract(A21, A11), add(B11, B12));
        int[][] M7 = multiply(subtract(A12, A22), add(B21, B22));

        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        // Combining results into a single matrix
        combine(C11, C12, C21, C22, C);
        return C;
    }

    private static void divide(int[][] A, int[][] A11, int[][] A12, int[][] A21, int[][] A22) {
        int n = A.length;
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            System.arraycopy(A[i], 0, A11[i], 0, m);
            System.arraycopy(A[i], m, A12[i], 0, m);
            System.arraycopy(A[i + m], 0, A21[i], 0, m);
            System.arraycopy(A[i + m], m, A22[i], 0, m);
        }
    }

    private static void combine(int[][] C11, int[][] C12, int[][] C21, int[][] C22, int[][] C) {
        int n = C.length;
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            System.arraycopy(C11[i], 0, C[i], 0, m);
            System.arraycopy(C12[i], 0, C[i], m, m);
            System.arraycopy(C21[i], 0, C[i + m], 0, m);
            System.arraycopy(C22[i], 0, C[i + m], m, m);
        }
    }

    private static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    private static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }public class StrassenMatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] C = multiply(A, B);
        System.out.println("Product of matrices:");
        printMatrix(C);
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int m = n / 2;
        int[][] A11 = new int[m][m];
        int[][] A12 = new int[m][m];
        int[][] A21 = new int[m][m];
        int[][] A22 = new int[m][m];
        int[][] B11 = new int[m][m];
        int[][] B12 = new int[m][m];
        int[][] B21 = new int[m][m];
        int[][] B22 = new int[m][m];

        // Dividing matrices into quadrants
        divide(A, A11, A12, A21, A22);
        divide(B, B11, B12, B21, B22);

        int[][] M1 = multiply(add(A11, A22), add(B11, B22));
        int[][] M2 = multiply(add(A21, A22), B11);
        int[][] M3 = multiply(A11, subtract(B12, B22));
        int[][] M4 = multiply(A22, subtract(B21, B11));
        int[][] M5 = multiply(add(A11, A12), B22);
        int[][] M6 = multiply(subtract(A21, A11), add(B11, B12));
        int[][] M7 = multiply(subtract(A12, A22), add(B21, B22));

        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        // Combining results into a single matrix
        combine(C11, C12, C21, C22, C);
        return C;
    }

    private static void divide(int[][] A, int[][] A11, int[][] A12, int[][] A21, int[][] A22) {
        int n = A.length;
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            System.arraycopy(A[i], 0, A11[i], 0, m);
            System.arraycopy(A[i], m, A12[i], 0, m);
            System.arraycopy(A[i + m], 0, A21[i], 0, m);
            System.arraycopy(A[i + m], m, A22[i], 0, m);
        }
    }

    private static void combine(int[][] C11, int[][] C12, int[][] C21, int[][] C22, int[][] C) {
        int n = C.length;
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            System.arraycopy(C11[i], 0, C[i], 0, m);
            System.arraycopy(C12[i], 0, C[i], m, m);
            System.arraycopy(C21[i], 0, C[i + m], 0, m);
            System.arraycopy(C22[i], 0, C[i + m], m, m);
        }
    }

    private static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    private static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

        }
        return C;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
