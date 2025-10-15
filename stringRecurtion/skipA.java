class Main {
    static void skip(String A, String B) {
        if (B.isEmpty()) {
            System.out.println(A);
            return;
        }

        char ch = B.charAt(0);

        if (ch == 'a') {
            skip(A, B.substring(1));   // skip 'a'
        } else {
            skip(A + ch, B.substring(1));  // keep other chars
        }
    }

    public static void main(String[] args) {
        skip("", "baccada");
    }
}
