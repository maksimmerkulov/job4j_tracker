package ru.job4j.stream;

import java.time.LocalDate;

/**
 * Car model with nested Builder for flexible object construction.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Car {

    /** The car brand. */
    private String brand;

    /** The car model name. */
    private String model;

    /** The production date. */
    private LocalDate created;

    /** The engine volume. */
    private double volume;

    /** The car color. */
    private String color;

    /**
     * Builder class for constructing {@link Car} instances.
     */
    static class Builder {

        /** The car brand for the builder. */
        private String brand;

        /** The car model for the builder. */
        private String model;

        /** The creation date for the builder. */
        private LocalDate created;

        /** The volume for the builder. */
        private double volume;

        /** The color for the builder. */
        private String color;

        /**
         * Sets the car brand.
         *
         * @param brand the brand to set
         * @return the {@code Builder} instance
         */
        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Sets the car model.
         *
         * @param model the model to set
         * @return the {@code Builder} instance
         */
        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        /**
         * Sets the car creation date.
         *
         * @param created the date to set
         * @return the {@code Builder} instance
         */
        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        /**
         * Sets the car engine volume.
         *
         * @param volume the volume to set
         * @return the {@code Builder} instance
         */
        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        /**
         * Sets the car color.
         *
         * @param color the color to set
         * @return the {@code Builder} instance
         */
        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        /**
         * Finalizes the construction of the {@link Car} object.
         *
         * @return the constructed {@code Car}
         */
        Car build() {
            Car car = new Car();
            car.brand = this.brand;
            car.model = this.model;
            car.created = this.created;
            car.volume = this.volume;
            car.color = this.color;
            return car;
        }
    }

    /**
     * Returns a string representation of the car.
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", created=" + created
                + ", volume=" + volume
                + ", color='" + color + '\''
                + '}';
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Toyota")
                .buildModel("Camry")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(2.5)
                .buildColor("Red")
                .build();
        System.out.println(car);
        Car customCar = new Builder()
                .buildBrand("BMW")
                .buildModel("X5")
                .buildColor("Black")
                .build();
        System.out.println(customCar);
    }
}
