package Lab9;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Clock clock = new Clock();
	System.out.println("1.Garaar tohiruulah");
	System.out.println("2.Automataar tohiruulah");
	System.out.println("songolt: ");
	int choice = sc.nextInt();
if (choice == 1) {
	System.out.println("Year: ");
	int y = sc.nextInt();
	System.out.println("Month: ");
	int mon = sc.nextInt();
	System.out.println("Day: ");
	int d = sc.nextInt();
	System.out.println("Time: ");
	int t = sc.nextInt();
	System.out.println("MInute: ");
	int min = sc.nextInt();
	System.out.println("Second: ");
	int s = sc.nextInt();
clock.setClock(y, mon, d, t, min, s);
}
else if (choice == 2) {
	clock.autoSetClock();
}
System.out.println("1.1000 second yvuulah");
System.out.println("2.Second taaruulah");
System.out.println("SOngolt: ");
int tickchoice = sc.nextInt();
if (tickchoice == 1) {
	clock.tickClock();
}
else if (tickchoice == 2);
System.out.println("HUgatsaaga oruul: ");
int tick = sc.nextInt();
clock.tickClock(tick);
}
}
