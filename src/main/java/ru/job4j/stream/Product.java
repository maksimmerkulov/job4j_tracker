package ru.job4j.stream;

import java.util.Objects;

/**
 * Product model with storage standards and actual storage time.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Product {

    /** The name of the product. */
    private String name;

    /** The original price of the product. */
    private float price;

    /** The total storage standard in days. */
    private int standard;

    /** The actual number of days the product has been stored. */
    private int actual;

    /**
     * Creates a new {@code Product} with the specified data.
     *
     * @param name     the name of the product
     * @param price    the price of the product
     * @param standard the storage standard in days
     * @param actual   the actual storage time in days
     */
    public Product(String name, float price, int standard, int actual) {
        this.name = name;
        this.price = price;
        this.standard = standard;
        this.actual = actual;
    }

    /**
     * Returns the name of the product.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the product.
     *
     * @return the product price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Returns the storage standard of the product.
     *
     * @return the storage standard
     */
    public int getStandard() {
        return standard;
    }

    /**
     * Returns the actual storage time of the product.
     *
     * @return the actual storage time
     */
    public int getActual() {
        return actual;
    }

    /**
     * Compares this product with the specified object for equality.
     *
     * @param o the object to compare
     * @return {@code true} if the objects are equal, {@code false} otherwise
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
        return Float.compare(product.price, price) == 0
                && standard == product.standard
                && actual == product.actual
                && Objects.equals(name, product.name);
    }

    /**
     * Returns the hash code value for this product.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, price, standard, actual);
    }
}
