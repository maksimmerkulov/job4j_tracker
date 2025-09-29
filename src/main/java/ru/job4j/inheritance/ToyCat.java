package ru.job4j.inheritance;

/**
 * Represents a toy cat, extending the base cat functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ToyCat extends Cat {

    /**
     * Indicates whether the toy cat can be washed in a washing machine.
     *
     * @return {@code true} if it is machine washable, {@code false} otherwise
     */
    public boolean canBeWashByWashMachine() {
        return true;
    }
}
