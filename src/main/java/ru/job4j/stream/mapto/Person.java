package ru.job4j.stream.mapto;

import java.util.Objects;

/**
 * Person model representing an individual with a name and age.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Person {

    /** The name of the person. */
    private String name;

    /** The age of the person. */
    private Integer age;

    /**
     * Creates a new {@code Person} with the specified name and age.
     *
     * @param name the person name
     * @param age  the person age
     */
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the person.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Compares this person with the specified object for equality.
     *
     * @param o the object to compare
     * @return {@code true} if the objects are equal, {@code false} otherwise
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
        return Objects.equals(name, person.name)
                && Objects.equals(age, person.age);
    }

    /**
     * Returns the hash code value for this person.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Returns a string representation of the person.
     *
     * @return the formatted string
     */
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
