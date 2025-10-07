package ru.job4j.polymorphism;

/**
 * Implements the {@link Transport} contract for a city bus.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Bus implements Transport {

    /**
     * Moves the bus along its city route.
     */
    @Override
    public void move() {
        System.out.println("The bus starts moving along the route.");
    }

    /**
     * Sets the number of passengers currently boarding the bus.
     *
     * @param count the total number of passengers
     */
    @Override
    public void passengers(int count) {
        System.out.println("The bus accommodates " + count + " passengers.");
    }

    /**
     * Refuels the bus tank, calculates the cost using a fractional price,
     * and returns the exact fractional total.
     *
     * @param fuel the amount of fuel to add
     * @return the total cost of refueling
     */
    @Override
    public double refuel(int fuel) {
        System.out.println("Refueling the bus with " + fuel + " liters.");
        double price = 72.99;
        return fuel * price;
    }
}
