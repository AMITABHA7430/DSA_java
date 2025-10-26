public class Dice {
    public static void main(String[] args) {
        dBacktracking("", 3, 3);
    }

    static void dBacktracking(String p, int r, int c) {
        // Base case: reached destination
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        // Move Right if possible (c > 1)
        if (c > 1) {
            dBacktracking(p + 'R', r, c - 1);
        }

        // Move Down if possible (r > 1)
        if (r > 1) {
            dBacktracking(p + 'D', r - 1, c);
        }
        if (r > 1&&c>1) {
            dBacktracking(p + 'd', r - 1, c-1);
        }
    }
}
