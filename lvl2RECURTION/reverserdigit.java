class Main {
    public static void main(String[] args) {
        int result = dgtREv(12345678, 0);
        System.out.println(result);
    }

    public static int dgtREv(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return dgtREv(n / 10, rev * 10 + n % 10);
    }
}
