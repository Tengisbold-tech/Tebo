package lab10;

public class Worker extends Person {
private String Akod; 
private String Sner; 
private String AorsonOgnoo;

public Worker(String ovog, String ner, String register, String tursunUdur, String Akod, String Sner, String AorsonOgnoo) {
	super(ovog, ner, register, tursunUdur);
	this.Akod = Akod;
	this.Sner = Sner;
	this.AorsonOgnoo = AorsonOgnoo;
}

@Override
public void info() {
	super.info();
	 System.out.println("Ajiltnii kod: " + Akod);
	  System.out.println("Salbariin ner: " + Sner);
	  System.out.println("Ajild orson ognoo: " + AorsonOgnoo);
	  System.out.println("Ajild orson on: " + getYear(AorsonOgnoo));
	  System.out.println("Ajild orson sar: " + getMonth(AorsonOgnoo));
	  System.out.println("Ajild orson udur: " + getDay(AorsonOgnoo));
}
}
