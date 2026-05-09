package firstJava;
import java.util.function.Supplier;

public class ami {
	public static void main(String[] args) {
		
		Supplier<String> otpGenerate = ()->{
			String otp="";
			
			for(int i=0;i<4;i++) {
			otp=otp+((int)(Math.random()*10));}
			return otp;
		};
		System.out.println(otpGenerate.get());
		System.out.println(otpGenerate.get());
		System.out.println(otpGenerate.get());
		System.out.println(otpGenerate.get());
		
	}
}
