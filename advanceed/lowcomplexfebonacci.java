import java.util.Scanner;

class Main {
    public static int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;
        
        double fib = (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5;   //here formula use is that f(n)=((1+(root5/2))/root5)-((1-(root5/2))/root5)
        return (int)Math.round(fib);  // Rounding for accuracy
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term to get Fibonacci number:");
        int a = scanner.nextInt();
        int result = fibonacci(a);
        System.out.println("Fibonacci number at position " + a + " is: " + result);
    }
}
