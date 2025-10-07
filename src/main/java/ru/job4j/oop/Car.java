package ru.job4j.oop;

/**
 * Represents a car with internal components that inherits from the
 * {@link Transport} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Car extends Transport {

    /**
     * The brand of the car.
     */
    private String brand;

    /**
     * The model of the car.
     */
    private String model;

    /**
     * Creates a new default car instance with empty fields.
     */
    public Car() {
    }

    /**
     * Creates a new {@code Car} with the specified brand and model.
     *
     * @param brand the car brand
     * @param model the car model
     */
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Creates and returns a trip computer instance for a new car.
     *
     * @return the trip computer instance
     */
    public static TripComputer getTripComputer() {
        Car car = new Car("Brand", "Model");
        Car.TripComputer tripComputer = car.new TripComputer();
        return tripComputer;
    }

    /**
     * Starts the car engine.
     */
    public void startEngine() {
        System.out.println("Engine started");
    }

    /**
     * Manages the car transmission and acceleration mechanics.
     */
    public class Transmission {

        /**
         * Performs acceleration.
         */
        public void accelerate() {
            System.out.println("Accelerating");
        }
    }

    /**
     * Handles the car braking system and deceleration operations.
     */
    public class Brakes {

        /**
         * Performs braking.
         */
        public void brake() {
            System.out.println("Braking");
        }
    }

    /**
     * Computes and monitors trip diagnostics data from the vehicle.
     */
    public class TripComputer {

        /**
         * The trip data description.
         */
        private String tripData = "Trip Computer Data";

        /**
         * The model of the trip computer.
         */
        private String model = "TripComputer Model";

        /**
         * Prints information from both the trip computer and the car.
         */
        public void getInfo() {
            System.out.println("TripComputer model: " + this.model);
            System.out.println("Car model: " + Car.this.model);
        }
    }
}
