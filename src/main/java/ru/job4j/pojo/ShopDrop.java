package ru.job4j.pojo;

/**
 * Deletes an element from an array by index and shifts the remaining
 * elements to the left.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShopDrop {

    /**
     * Deletes the product at the specified index and shifts following
     * elements left.
     *
     * @param products the array of products
     * @param index    the index of the element to delete
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
