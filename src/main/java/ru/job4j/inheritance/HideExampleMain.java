package ru.job4j.inheritance;

/**
 * A main runner class demonstrating the difference between method overriding
 * and method hiding.
 *
 * <p>Example output:
 * <pre>{@code
 * Instance method call in Animal
 * Instance method call in Cat
 * Static method call in Animal
 * Static method call in Cat
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HideExampleMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
    }
}
