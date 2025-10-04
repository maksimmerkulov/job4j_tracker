package ru.job4j.io;

import java.util.Scanner;

/**
 * Provides an entry point for the "11 Matches" game using {@link Scanner}.
 *
 * <p>Example output:
 * <pre>{@code
 * Game 11.
 * Player 1 enter a number from 1 to 3: 3
 * Player 1 entered the number: 3
 * Matches left on the table: 0
 *
 * Player 1 won
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Matches {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Player 1" : "Player 2";
            System.out.print(player + " enter a number from 1 to 3: ");
            int matches = Integer.parseInt(input.nextLine());
            System.out.println(player + " entered the number: " + matches);
            if (matches >= 1 && matches <= 3) {
                if (matches <= count) {
                    count -= matches;
                    turn = !turn;
                    System.out.println("Matches left on the table: " + count);
                } else {
                    System.out.println("Invalid input. Not enough matches.");
                }
            } else {
                System.out.println("Invalid input. Enter 1, 2 or 3.");
            }
            System.out.println();
        }
        if (!turn) {
            System.out.println("Player 1 won");
        } else {
            System.out.println("Player 2 won");
        }
    }
}
