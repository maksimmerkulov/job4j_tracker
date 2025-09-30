package ru.job4j.pojo;

import java.util.Objects;

/**
 * Represents a product model in the warehouse system.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Product {

    /**
     * Provides the name of the product.
     */
    private String name;

    /**
     * Provides the count of the product.
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
     * Returns the product name.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name.
     *
     * @param name the product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the product count.
     *
     * @return the product count
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the product count.
     *
     * @param count the product count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return count == product.count && Objects.equals(name, product.name);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}
