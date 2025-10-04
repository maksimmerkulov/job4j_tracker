package ru.job4j.polymorphism;

/**
 * Provides in-memory storage implementation for {@link Store}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MemoryStore implements Store {

    /**
     * Internal storage for string data.
     */
    private String[] memoryStore = new String[100];

    /**
     * Current number of elements in the storage.
     */
    private int size = 0;

    /**
     * Saves the specified data to the memory array.
     *
     * @param data the data to save
     */
    @Override
    public void save(String data) {
        memoryStore[size++] = data;
    }

    /**
     * Reads all data from the memory and joins it into a single string.
     *
     * @return the joined data string
     */
    @Override
    public String read() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buffer.append(memoryStore[i]);
        }
        return buffer.toString();
    }
}
