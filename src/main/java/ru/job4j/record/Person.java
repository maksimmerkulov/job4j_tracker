package ru.job4j.record;

import java.util.Objects;

/**
 * Represents a person with a name and age.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Person {

    /**
     * Name of the person.
     */
    private final String name;

    /**
     * Age of the person.
     */
    private final int age;

    /**
     * Creates a new {@code Person} with the specified name and age.
     *
     * @param name the person name
     * @param age  the person age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the person name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if this object is the same as the o argument
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    /**
     * Returns a hash code value for the person.
     *
     * @return a hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

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
