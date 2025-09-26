package ru.job4j.oop;

/**
 * Provides methods for printing user information using method overloading.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OverloadRunner {

    /**
     * Prints the name and age of a user.
     *
     * @param name the user name
     * @param age  the user age
     */
    public void print(String name, int age) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
    }

    /**
     * Prints the name, age, and allowance status of a user.
     *
     * @param name  the user name
     * @param age   the user age
     * @param allow the allowance status
     */
    public void print(String name, int age, boolean allow) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
    }

    /**
     * Prints the name, age as {@code double}, and allowance status of a user.
     *
     * @param name  the user name
     * @param age   the user age
     * @param allow the allowance status
     */
    public void print(String name, double age, boolean allow) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
    }

    /**
     * Prints the allowance status, age, and name of a user.
     *
     * @param allow the allowance status
     * @param age   the user age
     * @param name  the user name
     */
    public void print(boolean allow, int age, String name) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
    }
}
