package ru.job4j.io;

import java.util.Scanner;

/**
 * Provides an entry point for the console-based game menu
 * using {@link Scanner}.
 *
 * <p>Example output:
 * <pre>{@code
 * Games.
 * 1. Battle City
 * 2. Super Mario
 * 3. Exit
 * Select a menu item to start the game: 1
 * Battle City is loading ...
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Dendy {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Games.");
            System.out.println("1. Battle City");
            System.out.println("2. Super Mario");
            System.out.println("3. Exit");
            System.out.print("Select a menu item to start the game: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Game over.");
                run = false;
            } else if (select == 1) {
                System.out.println("Battle City is loading ... ");
            } else if (select == 2) {
                System.out.println("Super Mario is loading ... ");
            } else {
                System.out.println("No such game exists.");
            }
            System.out.println();
        }
    }
}
