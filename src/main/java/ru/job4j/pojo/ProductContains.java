package ru.job4j.pojo;

/**
 * A main runner class demonstrating the equality comparison between two
 * {@link Product} objects.
 *
 * <p>Example output:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ProductContains {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean isEqual = first.equals(second);
        System.out.println(isEqual);
    }
}
