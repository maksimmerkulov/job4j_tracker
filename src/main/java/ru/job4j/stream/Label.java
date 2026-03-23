package ru.job4j.stream;

import java.util.Objects;

/**
 * Label model representing a product name and its discount price.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Label {

    /** The name of the product. */
    private String name;

    /** The discount price of the product. */
    private float price;

    /**
     * Creates a new {@code Label} with the specified name and price.
     *
     * @param name  the product name
     * @param price the discount price
     */
    public Label(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name on the label.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name on the label.
     *
     * @param name the product name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price on the label.
     *
     * @return the product price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the price on the label.
     *
     * @param price the product price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Compares this label with the specified object for equality.
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
        Label label = (Label) o;
        return Float.compare(label.price, price) == 0
                && Objects.equals(name, label.name);
    }

    /**
     * Returns the hash code value for this label.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    /**
     * Returns a string representation of the label.
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return "Label{"
                + "name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}
