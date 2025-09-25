package ru.job4j.oop;

/**
 * Represents a battery that can exchange charge with another battery.
 *
 * <p>Example output:
 * <pre>{@code
 * First. My charge: 70%
 * Second. My charge: 30%
 * First. My charge: 0%
 * Second. My charge: 100%
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Battery {

    /**
     * Current charge level of the battery.
     */
    private int load;

    /**
     * Creates a new {@code Battery} with the specified load.
     *
     * @param load the initial charge level
     */
    public Battery(int load) {
        this.load = load;
    }

    /**
     * Returns the battery's current charge information.
     *
     * @return the charge details
     */
    public String about() {
        return "My charge: " + this.load + "%";
    }

    /**
     * Transfers the entire charge from this battery to another.
     *
     * @param another the battery to receive the charge
     */
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        System.out.println("First. " + first.about());
        System.out.println("Second. " + second.about());
        first.exchange(second);
        System.out.println("First. " + first.about());
        System.out.println("Second. " + second.about());
    }
}
