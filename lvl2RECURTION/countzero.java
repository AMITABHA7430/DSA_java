class Main {
    public static void main(String[] args) {
        long num = 12050708000L;   // use long for large numbers
        int result = count(num);
        System.out.println(result);
    }

    public static int count(long n){
        return countH(n, 0);
    }

    public static int countH(long n, int c) {
        if (n == 0) {
            return c;
        }
        long rem = n % 10;
        if(rem == 0){
            return countH(n / 10, c + 1);
        }
        return countH(n / 10, c);
    }
}
