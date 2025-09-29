package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

/**
 * A main runner class starting the user interface and demonstrating
 * {@link Item} creation.
 *
 * <p>Example output:
 * <pre>{@code
 * 29-September-Monday-2025 17:30:30
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StartUI {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Item item = new Item("Fix bugs");
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(formatter));
    }
}
