package ru.job4j.oop;

/**
 * Represents a wooden doll that can contain another doll inside.
 *
 * <p>Example output:
 * <pre>{@code
 * Hello, my name is big doll
 * I have a child. Let's call her...
 * Hello, my name is middle doll
 * I have a child. Let's call her...
 * Hello, my name is little doll
 * I don't have a child.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class WoodDoll {

    /**
     * The nested child doll.
     */
    private WoodDoll child;

    /**
     * Name of the doll.
     */
    private String name;

    /**
     * Creates a new {@code WoodDoll} with the specified child and name.
     *
     * @param child the nested doll
     * @param name  the doll name
     */
    public WoodDoll(WoodDoll child, String name) {
        this.child = child;
        this.name = name;
    }

    /**
     * Displays information about this doll and its children.
     */
    public void about() {
        System.out.println("Hello, my name is " + this.name);
        if (this.child != null) {
            System.out.println("I have a child. Let's call her...");
            this.child.about();
        } else {
            System.out.println("I don't have a child.");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        WoodDoll little = new WoodDoll(null, "little doll");
        WoodDoll middle = new WoodDoll(little, "middle doll");
        WoodDoll big = new WoodDoll(middle, "big doll");
        big.about();
    }
}
