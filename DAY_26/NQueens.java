//The N-Queens problem involves placing N queens on an N×N chessboard such that no two queens threaten each other. @vinaypandey0001

public class NQueens {
    private int N;
    private int[] board;

    public NQueens(int N) {
        this.N = N;
        board = new int[N];
        solveNQueens(0);
    }

    private void solveNQueens(int row) {
        if (row == N) {
            printSolution();
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                solveNQueens(row + 1);
            }
        }
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || board[i] - i == col - row || board[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    private void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 8; // Change to the desired size of the board
        new NQueens(N);
    }
}
