package Lab9;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
import java.util.concurrent.TimeUnit;
public class Clock {
	 private int year;
	  private int month;
	  private int day;
	  private int time;
	  private int minute;
	  private int second;
	  private LocalDateTime ldt;
	  private DateTimeFormatter formatter;
	  
	  public Clock(int year, int month, int day, int time, int minute, int second ) {
		  this.year = year;
		  this.month = month;
		  this.day = day;
		  this.time = time;
		  this.minute = minute;
		  this.second = second;
		  
	  }
	  public Clock() {
	    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
	  }
	  public void setClock(int y, int mon, int d, int t, int min, int s) {
	   year = y;
	   month = mon;
	   day = d;
	   time = t;
	   minute = min;
	   second = s;
	   ldt = LocalDateTime.of(year, month, day, time, minute, second);
	   System.out.println("Garaar tohiruulah: ");
	   System.out.println(ldt.format(formatter));
	  }
	  public void autoSetClock() {
	    ldt = LocalDateTime.now();
	    year = ldt.getYear();
	    month = ldt.getMonthValue();
	    day = ldt.getDayOfMonth();
	    time = ldt.getHour();
	    minute = ldt.getMinute();
	    second = ldt.getSecond();
	    
	    System.out.println("Avtomataar taaruulah: ");
	    System.out.println(ldt.format(formatter));
	    
	  }
	  public void tickClock() {
	    tickClock(1000);
	  }
	  public void tickClock(int tick) {
	    try {
	    	for (int i = 0; i < tick; i++) {
	    		System.out.println(ldt.format(formatter));
	    	ldt = ldt.plusSeconds(1);
	    	TimeUnit.MILLISECONDS.sleep(1000);
	    	}
	    }
	  catch (Exception e) {
		  System.out.println("aldaa zaalaa.");
		  
	  }
	  }
	}

