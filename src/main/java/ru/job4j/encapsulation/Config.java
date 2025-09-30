package ru.job4j.encapsulation;

/**
 * Represents a configuration manager with private access to its state.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Config {

    /**
     * The name of the configuration.
     */
    private String name;

    /**
     * The current position in the config.
     */
    private int position;

    /**
     * The array of properties.
     */
    private String[] properties;

    /**
     * Creates a new {@code Config} with the specified name.
     *
     * @param name the config name
     */
    public Config(String name) {
        this.name = name;
    }

    /**
     * Prints the current position to the console.
     */
    public void print() {
        System.out.println(position);
    }

    /**
     * Returns the property value associated with the specified key.
     *
     * @param key the property key
     * @return the found value
     */
    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Searches for a property value internally.
     *
     * @param key the property key
     * @return the key itself as a search result
     */
    private String search(String key) {
        return key;
    }
}
