package ru.job4j.tracker;

/**
 * An item in the tracker system.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Item {

    /**
     * Unique identifier of the item.
     */
    private int id;

    /**
     * Name of the item.
     */
    private String name;

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
}
