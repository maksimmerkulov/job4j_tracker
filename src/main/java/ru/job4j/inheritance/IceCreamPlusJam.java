package ru.job4j.inheritance;

/**
 * Represents ice cream with an additional jam topping.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IceCreamPlusJam extends IceCream {

    /**
     * The fixed price of the jam topping.
     */
    private static final int JAM_PRICE = 50;

    /**
     * Creates a new {@code IceCreamPlusJam} with the specified weight.
     *
     * @param weight the weight of the ice cream
     */
    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    /**
     * Calculates the price by adding the jam price to the base ice cream price.
     *
     * @return the total price including jam
     */
    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }
}
