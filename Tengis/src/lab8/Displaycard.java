package lab8;

public class Displaycard {
	private int memory;
    private String chipset;
    private String brand;
    private double clockSpeed;

    public Displaycard(int memory, String chipset, String brand, double clockSpeed) {
        this.memory = memory;
        this.chipset = chipset;
        this.brand = brand;
        this.clockSpeed = clockSpeed;}

    public void printInfo() {
    	  System.out.println("Memory: " + memory + " GB");
          System.out.println("Chipset: " + chipset);
          System.out.println("Brand: " + brand);
          System.out.println("Clock Speed: " + clockSpeed + " GHz");
    }
}