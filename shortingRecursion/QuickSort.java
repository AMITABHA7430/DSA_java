// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class Main {
    static void Qsort(int[] num,int lo,int hi){
        if (lo>=hi){
            return;
        }
        int s=lo;
        int e=hi;
        int mid= s+(e-s) / 2;
        int pivot=num[mid];
        
        while(s<=e){
            while(num[s]<pivot){
                s++;
            }
            while(num[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=num[s];
                num[s]=num[e];
                num[e]=temp;
                s++;
                e--;
            }
        }
        Qsort(num,lo,e);
        Qsort(num,s,hi);
    }
    
    public static void main(String[] args) {
        int[] arr={1,3,6,2,9,5,8,4};
        Qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
