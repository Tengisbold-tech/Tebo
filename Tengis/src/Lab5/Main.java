package Lab5;
import java.util.Scanner;
public class Main {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
System.out.print("Ta heden too oruulah ve (1 - 5): ");
int n = sc.nextInt();

double a[] = new double[n];

for (int i = 0; i < n; i++) {
	System.out.printf("%d-r toog oruul: ", i + 1);
	a[i] = sc.nextDouble();
}
System.out.println("Method");

if(n == 2) {
	System.out.println("Mean = " + Statistics.mean(a[0], a[1]));
	System.out.println("Std = " + Statistics.std(a[0], a[1]));
}
if(n == 3) {
	System.out.println("Mean = " + Statistics.mean(a[0], a[1], a[2]));
	System.out.println("Std = " + Statistics.std(a[0], a[1], a[2]));
}
if(n == 4) {
	System.out.println("Mean = " + Statistics.mean(a[0], a[1], a[2], a[3]));
	System.out.println("Std = " + Statistics.std(a[0], a[1], a[2], a[3]));
}
if(n == 5) {
	System.out.println("Mean = " + Statistics.mean(a[0], a[1], a[2], a[3], a[4]));
	System.out.println("Std = " + Statistics.std(a[0], a[1], a[2], a[3], a[4]));
}
System.out.println("Varargs Method");

System.out.println("Mean = " + Statistics.meanVar(a));
System.out.println("Std = " + Statistics.stdVar(a));

sc.close();

}
}
