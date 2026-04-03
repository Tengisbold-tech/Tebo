package lab8;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Displaycard displayCard;
    private SoundCard soundCard;

    public Computer() {
        
        processor = new Processor("Intel", 8, 3.6, 16);
        memory = new Memory(16, "DDR4", 3200, "Corsair");
        displayCard = new Displaycard(8, "RTX 3060", "NVIDIA", 1.7);
        soundCard = new SoundCard(6, 48000, "Realtek", "PCIe");
    }

    public void showInfo() {
        System.out.println("COMPUTER INFO");

        processor.printInfo();
        System.out.println();

        memory.printInfo();
        System.out.println();

        displayCard.printInfo();
        System.out.println();

        soundCard.printInfo();
    }
}