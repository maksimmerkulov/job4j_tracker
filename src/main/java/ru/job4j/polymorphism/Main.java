package ru.job4j.polymorphism;

/**
 * Demonstrates vehicle polymorphism by executing controls on a
 * {@link SportCar} instance.
 *
 * <p>Example output:
 * <pre>{@code
 * Manual transmission. Shift to first, then up to sixth.
 * Electronic throttle pedal.
 * Shortened steering rack for faster turning.
 * Reinforced braking system.
 * Refuel with 100 liters of gasoline.
 * Formula for calculating the aerodynamic drag coefficient.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();
        Vehicle.getDragCoefficient();
    }
}
