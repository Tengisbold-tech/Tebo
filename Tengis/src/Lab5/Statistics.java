package Lab5;

public class Statistics {
public static double mean(double a, double b) {
	return (a + b)/2;
	}
public static double mean(double a, double b, double c) {
	return (a + b + c)/3;
	}
public static double mean(double a, double b, double c, double d) {
	return (a + b + c + d)/4;
	}
public static double mean(double a, double b, double c, double d, double e) {
	return (a + b + c + d + e)/5;
}


public static double std(double a, double b) {
	double m = mean(a, b);
	return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2 )) / 2);
}
public static double std(double a, double b, double c) {
	double m = mean(a, b, c);
	return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2 ) + Math.pow(c - m, 2))  /3);
}

public static double std(double a, double b, double c, double d) {
	double m = mean(a, b, c, d);
	return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2 ) + Math.pow(c - m, 2) + Math.pow(d - m, 2))  /4 );
}
public static double std(double a, double b, double c, double d, double e) {
	double m = mean(a, b, c, d, e);
	return Math.sqrt((Math.pow(a - m, 2) + Math.pow(b - m, 2 ) + Math.pow(c - m, 2) + Math.pow(d - m, 2) + Math .pow(e - m, 2))  /5 );
}

 public static double meanVar(double... numbers) {
	 double sum = 0;
 
for (double n : numbers) {
	sum += n;
} 
return sum/numbers.length;  }

 
 public static double stdVar(double... numbers) {
	 double m = meanVar(numbers);
	 double sum = 0;
	 
	 for (double n : numbers) {
		 sum += Math.pow(n - m, 2);
	 }
 return Math.sqrt(sum / numbers.length); 
 
 }}
 
