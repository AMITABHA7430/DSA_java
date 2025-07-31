 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, t, s = 0, e;
        
        System.out.println("Enter array size:");
        n = scanner.nextInt();
        e = n - 1;

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at position " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element to search:");
        t = scanner.nextInt();

        int index = binaryREC(arr, t, s, e);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
            System.out.println("Value: " + arr[index]);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }

    public static int binaryREC(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == t) {
            return m;
        } else if (arr[m] > t) {
            return binaryREC(arr, t, s, m - 1);
        } else {
            return binaryREC(arr, t, m + 1, e);
        }
    }
}
