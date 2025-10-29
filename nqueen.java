class Main {
    public static void main(String[] args) {
        int n = 4; // you can change board size here
        boolean[][] board = new boolean[n][n];
        System.out.println("Total solutions: " + queen(board, 0));
    }

    // Recursive function to place queens row by row
    static int queen(boolean[][] board, int row) {
        // Base case: if all queens are placed
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1; // one valid solution found
        }

        int count = 0; // number of valid solutions
        // Try placing queen in each column of this row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;           // place queen
                count += queen(board, row + 1);   // recursive call
                board[row][col] = false;          // backtrack
            }
        }
        return count;
    }

    // Function to check if placing queen at (row, col) is safe
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true; // safe position
    }

    // Function to print the board
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
