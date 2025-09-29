package ru.job4j.inheritance;

/**
 * Represents a pizza with extra cheese.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PizzaExtraCheese extends Pizza {

    /**
     * Returns the name of the pizza with extra cheese topping.
     *
     * @return the name with cheese
     */
    @Override
    public String name() {
        return super.name() + " + extra cheese";
    }
}
