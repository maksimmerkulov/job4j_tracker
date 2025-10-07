package ru.job4j.polymorphism;

/**
 * Provides a common contract for vehicle movement and control.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Vehicle extends Fuel {

    /**
     * Increases the current speed of the vehicle.
     */
    void accelerate();

    /**
     * Reduces the current speed or stops the vehicle.
     */
    void brake();

    /**
     * Changes the direction of the vehicle movement.
     */
    void steer();

    /**
     * Shifts the transmission gear of the vehicle.
     */
    void changeGear();
}
