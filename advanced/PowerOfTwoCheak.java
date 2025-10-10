import java.util.Scanner;

public class magic {

    public static void main(String[] args) {
        Scanner ami = new Scanner(System.in); // ✅ Corrected 'scanner' to 'Scanner' and fixed typo 'Syatem'

        int n;

        n = ami.nextInt();
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
