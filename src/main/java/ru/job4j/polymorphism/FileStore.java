package ru.job4j.polymorphism;

/**
 * Provides file-based storage implementation for {@link Store}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FileStore implements Store {

    /**
     * Path to the storage file.
     */
    private String path;

    /**
     * Creates a new {@code FileStore} with default values.
     */
    public FileStore() {
    }

    /**
     * Creates a new {@code FileStore} with the specified path.
     *
     * @param path the storage file path
     */
    public FileStore(String path) {
        this.path = path;
    }

    /**
     * Saves the specified data to the file.
     *
     * @param data the data to save
     */
    @Override
    public void save(String data) {
        /* Implementation of data storage in a file */
    }

    /**
     * Reads and returns data from the file.
     *
     * @return the read data or {@code null}
     */
    @Override
    public String read() {
        /* Implementation of file reading */
        return null;
    }
}
