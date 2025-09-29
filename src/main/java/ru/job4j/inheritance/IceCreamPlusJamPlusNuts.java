package ru.job4j.inheritance;

/**
 * An ice cream model with jam and nuts extending {@link IceCreamPlusJam}.
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
     * The fixed price of the nuts topping of the ice cream plus jam plus nuts.
     */
    private static final int NUTS_PRICE = 25;

    /**
     * Creates a new {@code IceCreamPlusJamPlusNuts} with the specified weight.
     *
     * @param weight the weight
     */
    public IceCreamPlusJamPlusNuts(int weight) {
        super(weight);
    }

    /**
     * Returns the price by adding the nuts price to the jam ice cream price.
     *
     * @return the total price value including jam and nuts
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
