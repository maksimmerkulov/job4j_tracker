package ru.job4j.tracker;

import java.time.LocalDateTime;

/**
 * An item model in the tracker system.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Item {

    /**
     * The id of the item.
     */
    private int id;

    /**
     * The name of the item.
     */
    private String name;

    /**
     * The creation timestamp of the item.
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
     * @param name the name
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Creates a new {@code Item} with the specified id and name.
     *
     * @param id   the identifier
     * @param name the name
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the unique identifier of the item.
     *
     * @return the item id value
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
     * @return the item name value
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
     * @return the creation timestamp value
     */
    public LocalDateTime getCreated() {
        return created;
    }
}
