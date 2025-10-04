package ru.job4j.polymorphism;

/**
 * Represents a data storage operation contract.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Store {

    /**
     * Saves the specified data to the store.
     *
     * @param data the data to save
     */
    void save(String data);

    /**
     * Reads and returns data from the store.
     *
     * @return the read data
     */
    String read();
}
