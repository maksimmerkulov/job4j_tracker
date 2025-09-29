package ru.job4j.inheritance;

/**
 * Represents ice cream with jam and nuts, demonstrating multi-level inheritance.
 *
 * <p>Example output:
 * <pre>{@code
 * 475
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IceCreamPlusJamPlusNuts extends IceCreamPlusJam {

    /**
     * The fixed price of the nuts topping.
     */
    private static final int NUTS_PRICE = 25;

    /**
     * Creates a new {@code IceCreamPlusJamPlusNuts} with the specified weight.
     *
     * @param weight the weight of the ice cream
     */
    public IceCreamPlusJamPlusNuts(int weight) {
        super(weight);
    }

    /**
     * Calculates the price by adding the nuts price to the jam ice cream price.
     *
     * @return the total price including jam and nuts
     */
    @Override
    public int price() {
        return NUTS_PRICE + super.price();
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        IceCreamPlusJamPlusNuts iceCream = new IceCreamPlusJamPlusNuts(4);
        System.out.println(iceCream.price());
    }
}
