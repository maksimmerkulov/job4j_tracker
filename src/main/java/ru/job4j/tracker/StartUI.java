package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Provides a console user interface for managing tracker items.
 *
 * <p>Example output:
 * <pre>{@code
 * Menu:
 * 0. Add new item
 * 1. Show all items
 * 2. Edit item
 * 3. Delete item
 * 4. Find item by id
 * 5. Find items by name
 * 6. Exit program
 * Select: 6
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class StartUI {

    /**
     * Initializes the main loop of the user interface.
     *
     * @param scanner the scanner to read user input
     * @param tracker the tracker instance to manage items
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("User selected: " + select);
            } else {
                run = false;
            }
        }
    }

    /**
     * Displays the application menu options to the console.
     */
    private void showMenu() {
        String[] menu = {
                "Add new item", "Show all items", "Edit item", "Delete item",
                "Find item by id", "Find items by name", "Exit program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
