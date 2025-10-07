package ru.job4j.polymorphism;

/**
 * Defines a general contract for any type of transport vehicle.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Transport {

    /**
     * Moves the transport forward.
     */
    void move();

    /**
     * Sets the number of passengers in the transport.
     *
     * @param count the total number of passengers
     */
    void passengers(int count);

    /**
     * Refuels the transport and calculates the cost of the fuel.
     *
     * @param fuel the amount of fuel to add
     * @return the total cost of refueling
     */
    double refuel(int fuel);
}
