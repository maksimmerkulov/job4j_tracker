package ru.job4j.io;

import java.util.Scanner;

/**
 * Provides an entry point to demonstrate user input reading
 * using {@link Scanner}.
 *
 * <p>Example output:
 * <pre>{@code
 * Welcome. What is your name? Maksim
 * Maksim, nice to see you!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Greeting {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome. What is your name? ");
        String name = input.nextLine();
        System.out.println(name + ", nice to see you!");
    }
}
