package ru.job4j.oop;

/**
 * Represents a virtual pet with weight management.
 *
 * <p>Example output:
 * <pre>{@code
 * Weight: 100
 * Weight: 110
 *
 * Weight: 100
 * Weight: 110
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Tamagotchi {

    /**
     * Current weight of the pet.
     */
    private int weight = 100;

    /**
     * Increases the pet's weight by feeding it.
     */
    public void feed() {
        weight += 10;
    }

    /**
     * Returns the pet's current weight information.
     *
     * @return the weight details
     */
    public String info() {
        return "Weight: " + weight;
    }

    /**
     * Feeds the specified pet instance.
     *
     * @param pet the pet to be fed
     */
    public static void feedPet(Tamagotchi pet) {
        pet.feed();
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Tamagotchi first = new Tamagotchi();
        System.out.println(first.info());
        first.feed();
        System.out.println(first.info());
        System.out.println();
        Tamagotchi second = new Tamagotchi();
        System.out.println(second.info());
        feedPet(second);
        System.out.println(second.info());
    }
}
