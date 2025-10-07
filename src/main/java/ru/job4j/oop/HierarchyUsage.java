package ru.job4j.oop;

/**
 * Demonstrates type casting principles including upcasting and downcasting.
 *
 * <p>Example output:
 * <pre>{@code
 * ru.job4j.oop.Car@4c873330
 * ru.job4j.oop.Bicycle@776ec8df
 * java.lang.Object@4eec7777
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HierarchyUsage {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object objectCar = new Car();
        Car carFromObject = (Car) objectCar;
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
