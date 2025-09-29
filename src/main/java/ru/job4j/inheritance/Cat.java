package ru.job4j.inheritance;

/**
 * A cat model extending the {@link Animal} and demonstrating method overriding
 * and hiding.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Cat extends Animal {

    /**
     * Hides the static method of the {@link Animal}.
     */
    public static void staticInvoke() {
        System.out.println("Static method call in Cat");
    }

    /**
     * Overrides the instance method of the {@link Animal}.
     */
    @Override
    public void instanceInvoke() {
        System.out.println("Instance method call in Cat");
    }
}
