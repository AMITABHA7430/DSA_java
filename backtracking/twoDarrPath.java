public class Dice {
    public static void main(String[] args) {
        System.out.println(dBacktracking(3, 3)); // example: 3x3
    }

    static int dBacktracking(int r, int c) {
        // 1) base case: reached destination (1,1)
        if (r == 1 && c == 1) return 1;

        // 2) out of bounds: no path
        if (r < 1 || c < 1) return 0;

        // 3) move left (c-1) and up (r-1)
        int left = dBacktracking(r, c - 1);
        int up   = dBacktracking(r - 1, c);

        return left + up;
    }
}
