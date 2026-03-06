package Lab3;
import java.util.Scanner;

public class bank {

    private static String name;
    private static String currency = "₮";
    private static double annualInterest = 18;
    private static double initialBalance;
    private static int time;
    static double accumulatedInterest;
    static double finalBalance;

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ta neree oruulna uu: ");
        name = input.next();

        System.out.print("Ta hadgalamjiin hugatsaagaa oruulna uu(sar): ");
        time = input.nextInt();

        System.out.print("Ta uldegdelee oruulna uu: ");
        initialBalance = input.nextDouble();

        
        accumulatedInterest = (initialBalance * (annualInterest / 12) * time) / 100;

        finalBalance = accumulatedInterest + initialBalance;

        SavingsReport();

        input.close();}
    

    public static void SavingsReport() {

    	System.out.println();
    	System.out.println("Ta \"Altan tulhuur hadgalamj\"-d " + initialBalance + currency + "-iig " 
    	        + time + " sariin hugatsaatai, jiliin " 
    	        + annualInterest + "%-iin huutei hadgaluulbal:");

    	System.out.println("Hadgalamjiin uldegdel: " 
    	        + finalBalance + currency + " bolno.");

    	System.out.println("Hurimtlagdsan huu: " 
    	        + accumulatedInterest + currency + " baina.");

    }
}
