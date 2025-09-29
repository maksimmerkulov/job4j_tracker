package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A main runner class demonstrating the formatting of current date and time
 * using {@link LocalDateTime}.
 *
 * <p>Example output:
 * <pre>{@code
 * Current date and time before formatting: 2025-09-29T17:30:30.123456
 * Current date and time after formatting: 29-09-2025 17:30:30
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UsagePackageDate {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time before formatting: "
                + currentDateTime);
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Current date and time after formatting: "
                + currentDateTimeFormat);
    }
}
