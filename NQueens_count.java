public class NQueens_count {
    public static boolean isSafe(char Q[][], int row, int col) {
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Q[i][j] == 'Q') {
                return false;
            }
        }

        // Check vertically above
        for (int i = row - 1; i >= 0; i--) {
            if (Q[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < Q.length; i--, j++) {
            if (Q[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void Queen(char Q[][], int row) {
        if (row == Q.length) {
            count++;
            return;
        }
        for (int i = 0; i < Q.length; i++) {
            if (isSafe(Q, row, i)) {
                Q[row][i] = 'Q';
                Queen(Q, row + 1);
                Q[row][i] = 'X';
            }
        }
    }
    static int count = 0;

    public static void main(String args[]) {
        int n = 5;
        char Q[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Q[i][j] = 'X';
            }
        }
        Queen(Q, 0);
        System.out.println("Total ways: " + count);
    }
}
