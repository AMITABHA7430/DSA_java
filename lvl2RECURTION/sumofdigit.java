class Main {
    public static void main(String[] args) {
        int result = dgtSum(12345678);
        System.out.println(result);
    }

    public static int dgtSum(int n) {
      
        if(n==0){
            return 0;
        }
        return (n%10) + dgtSum(n/10);
    }
}
