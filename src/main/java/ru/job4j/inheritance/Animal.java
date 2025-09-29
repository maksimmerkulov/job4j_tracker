package ru.job4j.inheritance;

/**
 * Represents a base animal in the method hiding demonstration.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Animal {

    /**
     * Prints a message from the static method of the Animal class.
     */
    public static void staticInvoke() {
        System.out.println("Static method call in Animal");
    }

    /**
     * Prints a message from the instance method of the Animal class.
     */
    public void instanceInvoke() {
        System.out.println("Instance method call in Animal");
    }
}
