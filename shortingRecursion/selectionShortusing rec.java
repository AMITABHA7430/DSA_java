import java.util.Arrays;

class Main {
    static void SelSort(int[] arr, int r, int c,int m) {
       
        if (r == 0) {
            return;
        }

     
        if (c < r) {
            if(arr[c]>arr[m]){
                SelSort(arr,r,c+1,c);
            }
            else{
                SelSort(arr,r,c+1,m);
            }
        }else{
            int temp= arr[m];
            arr[m]=arr[r-1];
            arr[r-1]=temp;
           SelSort(arr,r-1,0,0); 
        }
            
          
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 7, 6};
        int r = arr.length;

        SelSort(arr, r, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
