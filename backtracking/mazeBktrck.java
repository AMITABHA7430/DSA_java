// Java program to demonstrate backtracking in a maze (pathfinding)
// Author: Amitabha Ghosh
// Description: This program prints all possible paths from the top-left corner (0,0)
// to the bottom-right corner of a maze using recursive backtracking.

public class Dice {
    public static void main(String[] args) {

        // Define a 3x3 maze (true = open cell, false = blocked cell)
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        // Start the backtracking from top-left (0,0)
        Backtracking("", board, 0, 0);
    }

    /**
     * Recursive backtracking function to explore all possible paths in the maze.
     * @param p    - current path string (sequence of directions like "RRDD")
     * @param maze - boolean grid representing the maze (true = open, false = blocked)
     * @param r    - current row index
     * @param c    - current column index
     */
    static void Backtracking(String p, boolean[][] maze, int r, int c) {

        // ✅ Base Case: Reached destination (bottom-right corner)
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);  // Print one valid path
            return;
        }

        // 🚫 Stop recursion if the current cell is blocked
        if (!maze[r][c]) {
            return;
        }

        // Mark the current cell as visited to avoid revisiting
        maze[r][c] = false;

        // ➡ Move Right (if within bounds)
        if (c < maze[0].length - 1) {
            Backtracking(p + 'R', maze, r, c + 1);
        }

        // ⬇ Move Down (if within bounds)
        if (r < maze.length - 1) {
            Backtracking(p + 'D', maze, r + 1, c);
        }

        // ⬅ Move Left (if within bounds)
        if (c > 0) {
            Backtracking(p + 'L', maze, r, c - 1);
        }

        // ⬆ Move Up (if within bounds)
        if (r > 0) {
            Backtracking(p + 'U', maze, r - 1, c);
        }

        // ♻ Backtrack: unmark the current cell (so it can be used in other paths)
        maze[r][c] = true;
    }
}
