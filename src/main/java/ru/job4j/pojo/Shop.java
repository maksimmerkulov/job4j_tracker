package ru.job4j.pojo;

/**
 * A utility shop model for finding the first empty cell in a {@link Product}
 * array.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Shop {

    /**
     * Returns the index of the first {@code null} element in the array.
     *
     * @param products the array of products
     * @return the index of the first {@code null} element, or {@code -1}
     *         if not found
     */
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
