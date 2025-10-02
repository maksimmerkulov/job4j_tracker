package ru.job4j.record;

/**
 * Represents a person record with a name and age.
 *
 * @param name the person name
 * @param age  the person age
 * @author Maksim Merkulov
 * @version 1.0
 */
public record PersonRecord(String name, int age) {

    /**
     * Returns a string representation of the person.
     *
     * @return a string containing the person data
     */
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
