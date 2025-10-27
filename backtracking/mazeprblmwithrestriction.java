public class Dice {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        Backtracking("", board, 0, 0);
    }

    static void Backtracking(String p, boolean[][] maze, int r, int c) {
        // Base condition: reached destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // If cell is blocked, stop
        if (!maze[r][c]) {
            return;
        }

        // Move Right
        if (c < maze[0].length - 1) {
            Backtracking(p + 'R', maze, r, c + 1);
        }

        // Move Down
        if (r < maze.length - 1) {
            Backtracking(p + 'D', maze, r + 1, c);
        }
        if (r <maze.length-1 &&c<maze[0].length-1) {
            Backtracking(p + 'd',maze, r + 1, c+1);
        }
    }
}
