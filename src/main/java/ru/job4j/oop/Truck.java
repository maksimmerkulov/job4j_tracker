package ru.job4j.oop;

/**
 * A truck model extending the base {@link Vehicle} functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Truck extends Vehicle {

    /**
     * Accelerates using an electronic gas pedal.
     */
    @Override
    public void accelerate() {
        System.out.println("Electronic gas pedal");
    }

    /**
     * Steers using standard steering.
     */
    @Override
    public void steer() {
        System.out.println("Standard steering");
    }
}
