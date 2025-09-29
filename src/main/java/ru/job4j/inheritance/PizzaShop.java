package ru.job4j.inheritance;

/**
 * Demonstrates the pizza hierarchy and method overriding with {@code super}.
 *
 * <p>Example output:
 * <pre>{@code
 * Just tasty pizza
 * Just tasty pizza + extra cheese
 * Just tasty pizza + extra cheese + extra tomato
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PizzaShop {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato =
                new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}
