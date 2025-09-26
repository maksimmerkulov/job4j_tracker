package ru.job4j.max;

/**
 * Demonstrates the variable scope, showing the difference between class fields
 * and local variables.
 *
 * <p>Example output:
 * <pre>{@code
 * 1
 * 2
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Reduce {

    /**
     * The internal storage for the integer array.
     */
    private int[] array;

    /**
     * Assigns the specified array to the internal field.
     *
     * @param array the local variable (parameter) to store in the field
     */
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Prints all elements of the stored array to the console.
     */
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
