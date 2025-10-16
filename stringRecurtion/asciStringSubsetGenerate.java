class Main {
    static void subset(String A, String B) {
        // Base case: when B becomes empty, print the accumulated string A
        if (B.isEmpty()) {
            System.out.println(A);
            return;
        }

        char ch = B.charAt(0);

        // Option 1 → include current character
        subset(A + ch, B.substring(1));

        // Option 2 → include ASCII value of current character
        subset(A + (int) ch, B.substring(1));

        // Option 3 → exclude current character
        subset(A, B.substring(1));
    }

    public static void main(String[] args) {
        subset("", "abc");
    }
}
