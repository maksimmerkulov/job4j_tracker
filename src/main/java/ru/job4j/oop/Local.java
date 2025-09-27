package ru.job4j.oop;

/**
 * A model demonstrating the usage of local inner classes and variable
 * capturing.
 *
 * <p>Example output:
 * <pre>{@code
 * Petr Arsentev
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Local {

    /**
     * The first name of the person of the local.
     */
    private String name = "Petr";

    /**
     * Creates a local class to print the full name.
     */
    public void getFullName() {

        /**
         * The surname captured by the local inner class.
         */
        final String surname = "Arsentev";

        /**
         * A local class defined within a method.
         */
        class FullName {

            /**
             * Prints the name from the outer class and the local variable.
             */
            public void printFullName() {
                System.out.println(name + " " + surname);
            }
        }

        FullName fullName = new FullName();
        fullName.printFullName();
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
