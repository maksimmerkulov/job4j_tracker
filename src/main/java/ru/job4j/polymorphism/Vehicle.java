package ru.job4j.polymorphism;

/**
 * Provides a common contract for vehicle movement and control.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public interface Vehicle extends Fuel {

    /**
     * Defines the standard number of wheels for a common vehicle.
     */
    int WHEELS = 4;

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

    /**
     * Prints the aerodynamic drag coefficient calculation formula.
     */
    static void getDragCoefficient() {
        System.out.println(
                "Formula for calculating the aerodynamic drag coefficient."
        );
    }

    /**
     * Charges the vehicle battery located under the hood.
     */
    default void chargeBattery() {
        System.out.println("The battery is under the hood. Charge it.");
    }
}
