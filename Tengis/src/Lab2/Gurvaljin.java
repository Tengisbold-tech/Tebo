package Lab2;
import java.util.Scanner;
public class Gurvaljin {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double ax, ay, bx, by, cx, cy, a, b, c, p, S;
		 System.out.print("A tsegiin ax, ay: ");
	        ax = input.nextDouble();
	        ay = input.nextDouble();

	        System.out.print("B tsegiin bx, by: ");
	        bx = input.nextDouble();
	        by = input.nextDouble();

	        System.out.print("C tsegiin cx, cy: ");
	        cx = input.nextDouble();
	        cy = input.nextDouble();
		
	        a = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
	        b = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
	        c = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
	        
	        p = (a + b + c)/2;
	        
	        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	        
	        System.out.printf("Talbai ni: %.2f", S);
	        
	        input.close();
	}
	
}
