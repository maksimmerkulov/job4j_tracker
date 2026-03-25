package ru.job4j.stream;

import java.util.Objects;

/**
 * Address model representing a physical location.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Address {

    /** The name of the city. */
    private String city;

    /** The name of the street. */
    private String street;

    /** The house number. */
    private int home;

    /** The apartment number. */
    private int apartment;

    /**
     * Creates a new {@code Address} with the specified data.
     *
     * @param city      the name of the city
     * @param street    the name of the street
     * @param home      the house number
     * @param apartment the apartment number
     */
    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    /**
     * Returns the city name.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Compares this address with the specified object for equality.
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
        Address address = (Address) o;
        return home == address.home
                && apartment == address.apartment
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    /**
     * Returns the hash code value for this address.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }
}
