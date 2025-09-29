package ru.job4j.inheritance;

/**
 * A basic ice cream model.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IceCream {

    /**
     * The weight of the ice cream.
     */
    private int weight;

    /**
     * Creates a new {@code IceCream} with the specified weight.
     *
     * @param weight the weight
     */
    public IceCream(int weight) {
        this.weight = weight;
    }

    /**
     * Returns the price of the ice cream based on its weight.
     *
     * @return the total price value
     */
    public int price() {
        return weight * 100;
    }
}
