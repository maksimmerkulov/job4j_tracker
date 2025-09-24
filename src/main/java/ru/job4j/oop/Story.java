package ru.job4j.oop;

/**
 * Orchestrates the interaction between pioneer Petya, Little Red Riding Hood,
 * and the Wolf.
 *
 * <p>Example output:
 * <pre>{@code
 * Little Red Riding Hood called pioneer Petya for help.
 * The Wolf tried to eat Little Red Riding Hood...
 * Pioneer Petya killed the Wolf.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Story {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
