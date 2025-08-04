import java.util.Scanner;

public class Magic {

    public static void main(String[] args) {
        Scanner ami = new Scanner(System.in);

        int n, base = 5;
        n = ami.nextInt();
        int ans = 0;

        while (n > 0) {
            int last = n & 1;      // Get the last binary bit (0 or 1)
            n = n >> 1;            // Right shift to process the next bit
            ans += last * base;    // If bit is 1, add power of 5
            base = base * 5;       // Increase power of 5 for next bit
        }

        System.out.println(ans);   // Print the magic number
    }
}
