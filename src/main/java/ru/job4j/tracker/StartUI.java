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
 * Select: 0
 * === Add new item ===
 * Enter name: Fix bugs
 * Added item: Item{id=1, name='Fix bugs', created=06-October-Monday-2025 15:00:00}
 * Menu:
 * 0. Add new item
 * 1. Show all items
 * 2. Edit item
 * 3. Delete item
 * 4. Find item by id
 * 5. Find items by name
 * 6. Exit program
 * Select: 0
 * === Add new item ===
 * Enter name: Refactor code
 * Added item: Item{id=2, name='Refactor code', created=06-October-Monday-2025 15:15:00}
 * Menu:
 * 0. Add new item
 * 1. Show all items
 * 2. Edit item
 * 3. Delete item
 * 4. Find item by id
 * 5. Find items by name
 * 6. Exit program
 * Select: 0
 * === Add new item ===
 * Enter name: Write tests
 * Added item: Item{id=3, name='Write tests', created=06-October-Monday-2025 15:30:00}
 * Menu:
 * 0. Add new item
 * 1. Show all items
 * 2. Edit item
 * 3. Delete item
 * 4. Find item by id
 * 5. Find items by name
 * 6. Exit program
 * Select: 1
 * === Show all items ===
 * Item{id=1, name='Fix bugs', created=06-October-Monday-2025 15:00:00}
 * Item{id=2, name='Refactor code', created=06-October-Monday-2025 15:15:00}
 * Item{id=3, name='Write tests', created=06-October-Monday-2025 15:30:00}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
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
            if (select == 0) {
                System.out.println("=== Add new item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Added item: " + item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Storage does not contain items yet");
                }
            } else if (select == 6) {
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
