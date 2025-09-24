package ru.job4j.oop;

/**
 * Represents a computer configuration with monitors, storage, and CPU info.
 *
 * <p>Example output:
 * <pre>{@code
 * Multi-monitor: false
 * SSD: 0 GB
 * CPU model: null
 *
 * Multi-monitor: true
 * SSD: 500 GB
 * CPU model: Intel Core I7-10700K
 *
 * Multi-monitor: true
 * SSD: 256 GB
 * CPU model: AMD Ryzen 5 3600
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Computer {

    /**
     * Supports multiple monitors.
     */
    private boolean multiMonitor;

    /**
     * Capacity of the SSD in GB.
     */
    private int ssd;

    /**
     * Model name of the CPU.
     */
    private String cpu;

    /**
     * Creates a new {@code Computer} with default values.
     */
    public Computer() {
    }

    /**
     * Creates a new {@code Computer} with the specified parameters.
     *
     * @param multiMonitor support for multiple monitors
     * @param ssd          capacity in GB
     * @param cpu          model name
     */
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /**
     * Displays computer specifications to the console.
     */
    public void printInfo() {
        System.out.println("Multi-monitor: " + this.multiMonitor);
        System.out.println("SSD: " + this.ssd + " GB");
        System.out.println("CPU model: " + this.cpu);
        System.out.println();
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Computer defaultComputer = new Computer();
        defaultComputer.printInfo();
        Computer intelComputer = new Computer(true, 500, "Intel Core I7-10700K");
        intelComputer.printInfo();
        Computer amdComputer = new Computer(true, 256, "AMD Ryzen 5 3600");
        amdComputer.printInfo();
    }
}
