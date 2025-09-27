package ru.job4j.oop;

/**
 * Demonstrates the usage of anonymous classes based on the {@link Bird} class.
 *
 * <p>Example output:
 * <pre>{@code
 * Parrot is flying over the lawn
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class BirdMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Bird bird = new Bird() {

            /**
             * Overrides the flying action for a specific bird type.
             */
            @Override
            public void fly() {
                System.out.println("Parrot is flying over the lawn");
            }

            /**
             * Performs a flying action specific to the internal scope
             * of the anonymous class.
             */
            public void flyInside() {
                System.out.println(
                        "Parrot flies only inside the anonymous class"
                );
            }
        };
        bird.fly();
    }
}
