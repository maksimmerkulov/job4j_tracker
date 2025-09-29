package ru.job4j.inheritance;

/**
 * A main runner class demonstrating the inheritance mechanism between
 * {@link Cat} and {@link ToyCat}.
 *
 * <p>Example output:
 * <pre>{@code
 * true
 * true
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPurr());
        System.out.println(toy.canBeWashByWashMachine());
    }
}
