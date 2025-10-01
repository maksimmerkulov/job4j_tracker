package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Represents a storage for tasks and provides methods for working
 * with {@link Item} objects.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Tracker {

    /**
     * Array for storing items.
     */
    private final Item[] items = new Item[100];

    /**
     * Pointer for the next free cell.
     */
    private int ids = 1;

    /**
     * Number of items currently stored.
     */
    private int size = 0;

    /**
     * Adds the specified item to the storage.
     *
     * @param item the item to add
     * @return the added item
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Returns all non-null items from the storage.
     *
     * @return the array of all stored items
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Finds items by their name.
     *
     * @param key the name to search for
     * @return the array of items with the matching name
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                result[count++] = item;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Finds an item by its unique identifier.
     *
     * @param id the item id to search for
     * @return the found item, or {@code null} if not found
     */
    public Item findById(int id) {
        Item result = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}
