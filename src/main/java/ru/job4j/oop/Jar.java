package ru.job4j.oop;

/**
 * Represents a jar that can store and transfer liquid volume.
 *
 * <p>Example output:
 * <pre>{@code
 * First: 10. Second: 5
 * First: 15. Second: 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Jar {

    /**
     * Current volume of liquid in the jar.
     */
    private int value;

    /**
     * Creates a new {@code Jar} with the specified size.
     *
     * @param size the initial liquid volume
     */
    public Jar(int size) {
        this.value = size;
    }

    /**
     * Pours liquid from another jar into this one.
     *
     * @param another the jar to pour from
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("First: " + first.value
                + ". Second: " + second.value);
        first.pour(second);
        System.out.println("First: " + first.value
                + ". Second: " + second.value);
    }
}
