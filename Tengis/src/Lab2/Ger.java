package Lab2;
import java.util.Scanner;
public class Ger {
	public static void main(String args[]) {
		double R, P, PI=3.14, L;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Radiusaa oruulna uu:");
		R = input.nextDouble();
		
		P = 2*PI*R;
		
		L = P*3;
		System.out.printf("Tanii gert %.2f metr urttai busluur orno", L);
		
		input.close();	
	}
}
