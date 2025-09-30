package ru.job4j.pojo;

/**
 * A utility shop model for removing elements from a {@link Product} array by
 * index.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShopDrop {

    /**
     * Returns the array after removing the product at the specified index and
     * shifting following elements left.
     *
     * @param products the array of products
     * @param index    the index to delete
     * @return the array with shifted elements and a {@code null} last cell
     */
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
