class Main {
    public static void main(String[] args) {
        funrev(5);
        fun(5);
    }
    static void fun(int m){
        if(m==0){
            return;
        }
        System.out.println(m);
        fun(m-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}
