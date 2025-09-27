package ru.job4j.oop;

/**
 * Demonstrates the functionality of the {@link Truck} class.
 *
 * <p>Example output:
 * <pre>{@code
 * Electronic gas pedal
 * Standard steering
 * Standard braking system
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerate();
        truck.steer();
        truck.brake();
    }
}
