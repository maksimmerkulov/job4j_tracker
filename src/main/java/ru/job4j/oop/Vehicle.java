package ru.job4j.oop;

/**
 * An abstract vehicle model with common automotive capabilities.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public abstract class Vehicle {

    /**
     * The brand of the vehicle.
     */
    private String brand;

    /**
     * The model of the vehicle.
     */
    private String model;

    /**
     * The type of the vehicle.
     */
    private String type;

    /**
     * The number of passengers of the vehicle.
     */
    private int passengers;

    /**
     * The maximum speed of the vehicle.
     */
    private int maxSpeed;

    /**
     * Accelerates the vehicle.
     */
    public abstract void accelerate();

    /**
     * Steers the vehicle.
     */
    public abstract void steer();

    /**
     * Brakes the vehicle using the default braking system.
     */
    public void brake() {
        System.out.println("Standard braking system");
    }
}
