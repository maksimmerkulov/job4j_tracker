package ru.job4j.oop;

/**
 * Represents a cat with a name and food preferences.
 *
 * <p>Example output:
 * <pre>{@code
 * There are gav's food.
 * gav ate cutlet
 * There are black's food.
 * black ate fish
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Cat {

    /**
     * Name of the cat.
     */
    private String name;

    /**
     * Type of food the cat ate.
     */
    private String food;

    /**
     * Sets the nickname for the cat.
     *
     * @param nick the name to assign
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Sets the food for the cat.
     *
     * @param meat the food to eat
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Displays the cat's name and its food to the console.
     */
    public void show() {
        System.out.println(this.name + " ate " + this.food);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}
