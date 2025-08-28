class Main {
    public static void main(String[] args) {
    int n= 676 ;
     System.out.println(Integer.toBinaryString(n));
     System.out.println(setBit(n));
    }
    public static int setBit(int n){
        int count = 0;
        while(n>0){
            count++;
            n-=(n&-n);
        }
        // while(n>0){
        //     count++;
        //     n= n&(n-1);
            
        // }
        return count;
    }
}
