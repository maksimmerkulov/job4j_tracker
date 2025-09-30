package ru.job4j.pojo;

/**
 * A product model in the warehouse system.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Product {

    /**
     * The name of the product.
     */
    private String name;

    /**
     * The count of the product.
     */
    private int count;

    /**
     * Creates a new {@code Product} with the specified name and count.
     *
     * @param name  the product name
     * @param count the product count
     */
    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    /**
     * Returns the name of the product.
     *
     * @return the product name value
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the count of the product.
     *
     * @return the product count value
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of the product.
     *
     * @param count the product count
     */
    public void setCount(int count) {
        this.count = count;
    }
}
