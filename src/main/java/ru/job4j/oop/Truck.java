package ru.job4j.oop;

/**
 * Represents a truck, extending the base vehicle functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Truck extends Vehicle {

    /**
     * Increases speed using an electronic gas pedal.
     */
    @Override
    public void accelerate() {
        System.out.println("Electronic gas pedal");
    }

    /**
     * Controls the direction using standard steering.
     */
    @Override
    public void steer() {
        System.out.println("Standard steering");
    }
}
