package ru.job4j.oop;

/**
 * Abstraction for different types of vehicles.
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
     * The number of passengers.
     */
    private int passengers;

    /**
     * The maximum speed of the vehicle.
     */
    private int maxSpeed;

    /**
     * Increases the vehicle speed.
     */
    public abstract void accelerate();

    /**
     * Controls the direction of the vehicle.
     */
    public abstract void steer();

    /**
     * Activates the standard braking system.
     */
    public void brake() {
        System.out.println("Standard braking system");
    }
}
