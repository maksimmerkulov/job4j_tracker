package ru.job4j.inheritance;

/**
 * A base animal model in the method hiding demonstration.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Animal {

    /**
     * Prints a message from the static method.
     */
    public static void staticInvoke() {
        System.out.println("Static method call in Animal");
    }

    /**
     * Prints a message from the instance method.
     */
    public void instanceInvoke() {
        System.out.println("Instance method call in Animal");
    }
}
