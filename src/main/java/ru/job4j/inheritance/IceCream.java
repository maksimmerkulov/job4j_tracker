package ru.job4j.inheritance;

/**
 * Represents a basic ice cream entity.
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
     * @param weight the weight of the ice cream
     */
    public IceCream(int weight) {
        this.weight = weight;
    }

    /**
     * Calculates the price of the ice cream based on its weight.
     *
     * @return the total price
     */
    public int price() {
        return weight * 100;
    }
}
