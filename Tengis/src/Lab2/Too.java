package Lab2;
import java.util.Scanner;
public class Too {

	public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
	
	double a, b, Ar, Geo;
	
	System.out.printf("a toog oruul:");
	a = input.nextDouble();
	System.out.printf("b toog oruul:");
	b = input.nextDouble();
	
	Ar = (a + b)/2;
	Geo = Math.sqrt(a*b);
	
	System.out.printf("Aripmetic utga ni: %.2f", Ar);
	System.out.printf("\nGeometr utga ni: %.2f", Geo);
	
	input.close();
	
	} 
		
	
}
