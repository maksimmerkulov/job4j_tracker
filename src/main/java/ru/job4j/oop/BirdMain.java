package ru.job4j.oop;

/**
 * A main runner class demonstrating anonymous classes based on
 * the {@link Bird}.
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
             * Flies.
             */
            @Override
            public void fly() {
                System.out.println("Parrot is flying over the lawn");
            }

            /**
             * Flies specifically inside the internal scope of the anonymous
             * class.
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
