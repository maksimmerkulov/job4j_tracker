package ru.job4j.pojo;

/**
 * A main runner class managing {@link Product} items in a store and
 * demonstrating creation, replacement, and filtered output.
 *
 * <p>Example output:
 * <pre>{@code
 * Full list:
 * Milk - 10
 * Bread - 4
 * Egg - 19
 *
 * Replace milk to oil:
 * Oil - 11
 * Bread - 4
 * Egg - 19
 *
 * Shown only product.count > 10:
 * Oil - 11
 * Egg - 19
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Store {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        System.out.println("Full list:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println(System.lineSeparator() + "Replace milk to oil:");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println(System.lineSeparator()
                + "Shown only product.count > 10:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product.getCount() > 10) {
                System.out.println(product.getName() + " - "
                        + product.getCount());
            }
        }
    }
}
