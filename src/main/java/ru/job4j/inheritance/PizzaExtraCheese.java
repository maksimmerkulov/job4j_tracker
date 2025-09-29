package ru.job4j.inheritance;

/**
 * A pizza model with extra cheese extending {@link Pizza}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PizzaExtraCheese extends Pizza {

    /**
     * Returns the name of the pizza with extra cheese topping.
     *
     * @return the name with cheese value
     */
    @Override
    public String name() {
        return super.name() + " + extra cheese";
    }
}
