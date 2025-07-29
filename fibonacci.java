
import java.util.Scanner;
class Main {
    public static int febonacci(int n){
       if (n==0||n==1){
          return n;
       }
       else{
           return febonacci(n-1)+febonacci(n-2);
       }
       
   }
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("enter the number th term to get febonacci");
           int a = scanner.nextInt();
           int result=febonacci(a);
           System.out.println(result);
    }

   
}
