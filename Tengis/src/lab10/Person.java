package lab10;

public class Person {
	  // Гишүүн өгөгдлүүд
	  protected String ovog;
	  protected String ner;
	  protected String register;
	  protected String tursunUdur;

	  public Person(String ovog, String ner, String register, String tursunUdur ) {
	  this.ovog = ovog;
	  this.ner = ner;
	  this.register = register;
	  this.tursunUdur = tursunUdur;
	  }
	  
	  // Гишүүн методууд
	  protected String getFullName(String ovog, String ner) {
	  return ovog.charAt(0) + "." + ner;}
	  
	  // Энэ метод нь хүний овог нэрийг авахдаа овгийн эхний үсэг 
	  // болон өөрийн нэрийг ашиглан дараах хэлбэрийн дагуу авна.
	  // Овог, нэрийн хэлбэр: Г.Батчулуун
	  protected int getYear(String date) {
		  return Integer.parseInt(date.substring(0, 4));
	  }
	  protected int getMonth(String date) {
		  return Integer.parseInt(date.substring(5, 7));
	  }
	  protected int getDay(String date) {
		  return Integer.parseInt(date.substring(8, 10));
	  }
	  protected void info() {
		  System.out.println("Ovog ner: " + getFullName(ovog, ner));
		  System.out.println("Register: " + register);
		  System.out.println("Tursun udur: " + tursunUdur);
		  System.out.println("Tursun on: " + getYear(tursunUdur));
		  System.out.println("Tursun sar: " + getMonth(tursunUdur));
		  System.out.println("Tursun udur: " + getDay(tursunUdur));
	  }
	}