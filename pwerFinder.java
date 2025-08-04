
import java.util.Scanner;

public class magic {

    public static void main(String[] args) {
        Scanner ami = new Scanner(System.in); 

      int base;
      base= ami.nextInt();

       int power;
       power = ami.nextInt();
        int ans=1;
       while (power > 0){
           if((power & 1)==1){
               ans *= base ;

           }
           base*=base;
           power = power>> 1;
       }
        System.out.println(ans);

    }
}

