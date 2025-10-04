package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Provides an entry point for the Magic Ball prediction program
 * using {@link Scanner} and {@link Random}.
 *
 * <p>Example output:
 * <pre>{@code
 * I am the great Oracle. What do you want to know? Will it rain tomorrow?
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MagicBall {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("I am the great Oracle. What do you want to know? ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 -> System.out.println("Yes");
            case 1 -> System.out.println("No");
            default -> System.out.println("Maybe");
        }
    }
}
