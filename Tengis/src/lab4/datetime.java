package lab4;
import java.util.Scanner;
public class datetime {
Scanner input = new Scanner(System.in);

private int year;
private int month;
private int day; 

public datetime(String dt){
	 String [] values = dt.split("[-./ ]");
	 if (values.length == 3) {
	 this.year = Integer.parseInt(values[0]);
     this.month = Integer.parseInt(values[1]);
     this.day = Integer.parseInt(values[2]);
}}
    
     private int getyearcode(int year){ 
	 int y = year % 100;
     return (y + y / 4) % 7;
}
     private int getmonthcode(int month){
    	 switch (month) {
         case 1: return 0; 
         case 2: return 3;
         case 3: return 3;
         case 4: return 6;
         case 5: return 1;
         case 6: return 4;
         case 7: return 6;
         case 8: return 2;
         case 9: return 5;
         case 10: return 0;
         case 11: return 3;
         case 12: return 5;
         default: return 0;   }}
     
     private int getcenturycode(int century) {
         switch (century) {
             case 17: return 4;
             case 18: return 2;
             case 19: return 0;
             case 20: return 6;
             case 21: return 4;
             case 22: return 2;
             case 23: return 0;
             default: return 0; } }

     private int dayofweek() {
         int yearCode = getyearcode(year);
         int monthCode = getmonthcode(month);
         int centuryCode = getcenturycode(year / 100);
         int leapCode = getleapyearcode(year, month);

         return (yearCode + monthCode + centuryCode + day - leapCode) % 7;
     }

     private int getleapyearcode(int year, int month) {
         boolean isLeap = false;

         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
             isLeap = true;}

         if (isLeap && (month == 1 || month == 2)) {
             return 1;}
         return 0;
     }

    public void printdayofweek() {
    	String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    	int result = dayofweek();
    	System.out.printf("%d onii %d-r sariin %d bol %s%n",
    	        year, month, day, days[result]);
    }
    	 public static void main(String[] args) {
    		   Scanner sc = new Scanner(System.in);

    		 System.out.printf("Ognoogoo oruulna uu /yyyy.mm.dd/: ");
    		 String input = sc.nextLine();
    		
    		 datetime dt = new datetime(input);
    	        dt.printdayofweek();
    	        
    	 }
}
