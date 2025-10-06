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
 * Added item: Item{id=1, name='Fix bugs', created=06-October-Monday-2025 17:00:00}
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
 * Added item: Item{id=2, name='Write tests', created=06-October-Monday-2025 17:15:00}
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
 * Added item: Item{id=3, name='Fix bugs', created=06-October-Monday-2025 17:30:00}
 * Menu:
 * 0. Add new item
 * 1. Show all items
 * 2. Edit item
 * 3. Delete item
 * 4. Find item by id
 * 5. Find items by name
 * 6. Exit program
 * Select: 5
 * === Find items by name ===
 * Enter name: Fix bugs
 * Item{id=1, name='Fix bugs', created=06-October-Monday-2025 17:00:00}
 * Item{id=3, name='Fix bugs', created=06-October-Monday-2025 17:30:00}
 * Menu:
 * 0. Add new item
 * 1. Show all items
 * 2. Edit item
 * 3. Delete item
 * 4. Find item by id
 * 5. Find items by name
 * 6. Exit program
 * Select: 5
 * === Find items by name ===
 * Enter name: Refactor code
 * Items with name "Refactor code" not found
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.8
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
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item changed successfully");
                } else {
                    System.out.println("Error changing item");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                tracker.delete(id);
                System.out.println(
                        item != null
                                ? "Item deleted successfully"
                                : "Error deleting item"
                );
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Item with id " + id + " not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println(
                            "Items with name \"" + name + "\" not found"
                    );
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
