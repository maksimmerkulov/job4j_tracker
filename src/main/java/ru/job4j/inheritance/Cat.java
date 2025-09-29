package ru.job4j.inheritance;

/**
 * Represents a cat, demonstrating method overriding and hiding.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Cat extends Animal {

    /**
     * Hides the static method of the {@link Animal} class.
     */
    public static void staticInvoke() {
        System.out.println("Static method call in Cat");
    }

    /**
     * Overrides the instance method of the {@link Animal} class.
     */
    @Override
    public void instanceInvoke() {
        System.out.println("Instance method call in Cat");
    }
}
