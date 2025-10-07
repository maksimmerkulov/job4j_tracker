package ru.job4j.polymorphism;

/**
 * Implements the {@link Vehicle} contract for a high-performance sports car.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SportCar implements Vehicle {

    /**
     * Changes the gear using a manual transmission by shifting from the first
     * up to the sixth gear.
     */
    @Override
    public void changeGear() {
        System.out.println(
                "Manual transmission. Shift to first, then up to sixth."
        );
    }

    /**
     * Accelerates the vehicle utilizing an electronic throttle pedal system.
     */
    @Override
    public void accelerate() {
        System.out.println("Electronic throttle pedal.");
    }

    /**
     * Steers the vehicle using a shortened steering rack for faster steering
     * response.
     */
    @Override
    public void steer() {
        System.out.println("Shortened steering rack for faster turning.");
    }

    /**
     * Brakes the vehicle utilizing a reinforced high-performance braking
     * system.
     */
    @Override
    public void brake() {
        System.out.println("Reinforced braking system.");
    }

    /**
     * Refills the vehicle tank with one hundred liters of premium gasoline.
     */
    @Override
    public void refill() {
        System.out.println("Refuel with 100 liters of gasoline.");
    }
}
