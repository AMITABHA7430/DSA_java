class Main {
    public static int recArr(int[] arr, int i, int t) {
        
        if (i == arr.length) {
            return -1; 
        }

     
        if (arr[i] == t) {
            return i;
        }

       
        return recArr(arr, i + 1, t);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;

        int index = recArr(arr, 0, target);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index - " + index);
        }
    }
}
