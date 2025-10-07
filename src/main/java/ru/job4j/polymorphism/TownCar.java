package ru.job4j.polymorphism;

/**
 * Implements the {@link Vehicle} contract for a standard town car.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TownCar implements Vehicle {

    /**
     * Changes the gear using an automatic transmission by setting the selector
     * to drive mode.
     */
    @Override
    public void changeGear() {
        System.out.println("Automatic transmission. Set selector to D mode.");
    }

    /**
     * Accelerates the vehicle by mechanically opening the throttle valve via
     * the gas pedal.
     */
    @Override
    public void accelerate() {
        System.out.println(
                "Pressing the gas pedal mechanically opens the throttle valve."
        );
    }

    /**
     * Steers the vehicle utilizing a standard mechanical or hydraulic steering
     * system.
     */
    @Override
    public void steer() {
        System.out.println("Standard steering system.");
    }

    /**
     * Brakes the vehicle using a standard hydraulic friction braking system.
     */
    @Override
    public void brake() {
        System.out.println("Standard braking system.");
    }

    /**
     * Refills the vehicle tank with sixty liters of standard gasoline.
     */
    @Override
    public void refill() {
        System.out.println("Refuel with 60 liters of gasoline.");
    }
}
