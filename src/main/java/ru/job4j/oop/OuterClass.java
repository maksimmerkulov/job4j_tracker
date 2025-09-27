package ru.job4j.oop;

/**
 * A demonstration model showing the difference between static and non-static
 * nested classes.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OuterClass {

    /**
     * A static nested class model.
     *
     * <p>This class does not require an instance of the outer class.
     */
    static class StaticNestedClass {
    }

    /**
     * An inner non-static nested class model.
     *
     * <p>This class requires an instance of the outer class to be created.
     */
    class NestedClass {
    }
}
