package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents an item in the tracker system.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Item {

    /**
     * The formatter for displaying creation date and time.
     */
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    /**
     * Unique identifier of the item.
     */
    private int id;

    /**
     * Name of the item.
     */
    private String name;

    /**
     * Date and time when the item was created.
     */
    private LocalDateTime created = LocalDateTime.now();

    /**
     * Creates a new {@code Item} with default values.
     */
    public Item() {
    }

    /**
     * Creates a new {@code Item} with the specified name.
     *
     * @param name the item name
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Creates a new {@code Item} with the specified id and name.
     *
     * @param id   the item identifier
     * @param name the item name
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the unique identifier of the item.
     *
     * @return the item id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the item.
     *
     * @param id the item id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the name of the item.
     *
     * @return the item name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item.
     *
     * @param name the item name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the creation date and time of the item.
     *
     * @return the creation timestamp
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Returns a string representation of the item with a formatted date.
     *
     * @return a string containing the item data
     */
    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }
}
