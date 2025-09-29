package ru.job4j.inheritance;

/**
 * Represents a parent in the inheritance demonstration.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Parent {

    /**
     * The name of the parent.
     */
    private String name;

    /**
     * The age of the parent.
     */
    private int age;

    /**
     * Creates a new {@code Parent} with the specified name and age.
     *
     * @param name the parent name
     * @param age  the parent age
     */
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
