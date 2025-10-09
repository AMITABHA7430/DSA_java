class Main {
    public static int recArr(int[] arr, int i) {
        // Base case: if we reached the end, array is sorted
        if (i == arr.length - 1) {
            return 1;
        }

        // If current element is greater than next, array not sorted
        if (arr[i] > arr[i + 1]) {
            return 0;
        }

        // Recursive call
        return recArr(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = recArr(arr, 0);

        if (result == 1) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
