package ru.job4j.oop;

/**
 * A runner model demonstrating the interaction between an outer class and its
 * static nested class.
 *
 * <p>Example output:
 * <pre>{@code
 * num1 = 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NestedRunner {

    /**
     * The static field of the nested runner.
     */
    private static int numberOne;

    /**
     * The instance field of the nested runner.
     */
    private int numberTwo;

    /**
     * Creates a new {@code NestedRunner}.
     */
    public NestedRunner() {
    }

    /**
     * A static nested class model.
     *
     * <p>This class can modify static members of the outer class.
     */
    static class StaticNested {

        /**
         * Sets the value of the static field in the outer class.
         *
         * @param value the new value
         */
        void setStaticOuterVariable(int value) {
            numberOne = value;
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numberOne = 1;
        StaticNested nested = new StaticNested();
        nested.setStaticOuterVariable(2);
        System.out.println("num1 = " + numberOne);
    }
}
