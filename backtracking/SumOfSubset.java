import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 12, 13, 15, 18};
        int targetSum = 30;
        subsetSum(new ArrayList<>(), arr, targetSum, 0);
    }

    static void subsetSum(List<Integer> current, int[] arr, int target, int index) {
        // Base condition
        if (target == 0) {
            System.out.println(current);
            return;
        }

        // If we reach end of array or target becomes negative, stop
        if (index == arr.length || target < 0) {
            return;
        }

        // Include current element
        current.add(arr[index]);
        subsetSum(current, arr, target - arr[index], index + 1);

        // Backtrack: exclude the current element
        current.remove(current.size() - 1);

        // Exclude current element and move to next
        subsetSum(current, arr, target, index + 1);
    }
}
