import java.util.ArrayList;
import java.util.List;

class Main {

    // Function to generate all subsets
    static List<List<Integer>> subset(int[] arr) {
        // This will store all subsets
        List<List<Integer>> outer = new ArrayList<>();

        // Start with an empty subset
        outer.add(new ArrayList<>());

        // Iterate over every number in the array
        for (int num : arr) {
            int n = outer.size(); // Current number of subsets

            // For each existing subset, create a new subset including 'num'
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i)); // Copy existing subset
                internal.add(num); // Add current number to it
                outer.add(internal); // Add the new subset to the outer list
            }
        }

        return outer; // Return all subsets
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);

        // Print all subsets
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
