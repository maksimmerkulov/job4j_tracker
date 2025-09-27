package ru.job4j.oop;

/**
 * Demonstrates the difference between static and non-static nested classes.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OuterClass {

    /**
     * Represents a static nested class.
     * Does not require an instance of the outer class.
     */
    static class StaticNestedClass {
    }

    /**
     * Represents an inner (non-static) nested class.
     * Requires an instance of the outer class to be created.
     */
    class NestedClass {
    }
}
