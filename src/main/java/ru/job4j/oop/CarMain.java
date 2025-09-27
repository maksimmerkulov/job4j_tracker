package ru.job4j.oop;

/**
 * Demonstrates the interaction between the {@link Car} class
 * and its inner components.
 *
 * <p>Example output:
 * <pre>{@code
 * Engine started
 * Accelerating
 * Braking
 * TripComputer model: TripComputer Model
 * Car model: Model
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CarMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Car car = new Car("Brand", "Model");
        Car.Transmission transmission = car.new Transmission();
        Car.Brakes brakes = car.new Brakes();
        Car.TripComputer tripComputer = car.new TripComputer();
        car.startEngine();
        transmission.accelerate();
        brakes.brake();
        tripComputer.getInfo();
    }
}
