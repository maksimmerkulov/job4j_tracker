package ru.job4j.lambda;

/**
 * Demonstrates the usage of constructor references.
 *
 * <p>Example output:
 * <pre>{@code
 * Value: Example
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ConstructorRefMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        FuncInterface modelConstructor = Model::new;
        Model model = modelConstructor.function("Example");
        System.out.println("Value: " + model.getName());
    }
}
