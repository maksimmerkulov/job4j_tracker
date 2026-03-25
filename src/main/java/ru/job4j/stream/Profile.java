package ru.job4j.stream;

/**
 * Profile model containing user information.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Profile {

    /** The address of the user. */
    private Address address;

    /**
     * Creates a new {@code Profile} with the specified address.
     *
     * @param address the user address
     */
    public Profile(Address address) {
        this.address = address;
    }

    /**
     * Returns the address of the profile.
     *
     * @return the profile address
     */
    public Address getAddress() {
        return address;
    }
}
