package ru.job4j.inheritance;

/**
 * A pizza model with extra cheese and extra tomato extending
 * {@link PizzaExtraCheese}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    /**
     * Returns the name of the pizza with extra cheese and tomato toppings.
     *
     * @return the name with cheese and tomato value
     */
    @Override
    public String name() {
        return super.name() + " + extra tomato";
    }
}
