class Main {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1, col = -1;
        boolean emptyBox = false;

        // Find first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyBox = true;
                    break;
                }
            }
            if (emptyBox) break;
        }

        // No empty cell → solved
        if (!emptyBox) return true;

        // Try numbers 1–9
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;

                if (solve(board)) {
                    return true;
                }

                // Backtrack
                board[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Row check
        for (int x = 0; x < board.length; x++) {
            if (board[row][x] == num) return false;
        }

        // Column check
        for (int x = 0; x < board.length; x++) {
            if (board[x][col] == num) return false;
        }

        // Subgrid check
        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;

        for (int r = startRow; r < startRow + sqrt; r++) {
            for (int c = startCol; c < startCol + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
