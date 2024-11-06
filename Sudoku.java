public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit || sudoku[row][i] == digit) {
                return false;
            }
        }

        // Check 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int sudoku[][], int i, int j) {
        if (i == 9) {
            return true;  // Reached the end, solution found
        }

        // Determine next cell
        int nextRow = i;
        int nextCol = j + 1;
        if (j + 1 == 9) {
            nextRow = i + 1;
            nextCol = 0;
        }

        // Skip non-zero cells
        if (sudoku[i][j] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1-9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, i, j, digit)) {
                sudoku[i][j] = digit;
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[i][j] = 0;  // Backtrack
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {
            { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
            { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
            { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
            { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
            { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
            { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
            { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
            { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
            { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
