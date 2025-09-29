package ru.job4j.inheritance;

/**
 * A child model extending the {@link Parent} functionality with a patronymic.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Child extends Parent {

    /**
     * The patronymic of the child.
     */
    private String patronymic;

    /**
     * Creates a new {@code Child} with the specified name, age, and patronymic.
     *
     * @param name       the child name
     * @param age        the child age
     * @param patronymic the child patronymic
     */
    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }
}
