package ru.job4j.search;

/**
 * Model of a person with personal and contact information.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Person {

    /** The name of the person. */
    private String name;

    /** The surname of the person. */
    private String surname;

    /** The phone number of the person. */
    private String phone;

    /** The address of the person. */
    private String address;

    /**
     * Creates a new {@code Person} with the specified data.
     *
     * @param name the name of the person
     * @param surname the surname of the person
     * @param phone the phone number of the person
     * @param address the address of the person
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Returns the name of the person.
     *
     * @return the person name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the surname of the person.
     *
     * @return the person surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Returns the phone number of the person.
     *
     * @return the person phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns the address of the person.
     *
     * @return the person address
     */
    public String getAddress() {
        return address;
    }
}
