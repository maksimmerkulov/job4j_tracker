package ru.job4j.stream;

/**
 * User model representing a bank customer.
 *
 * @param passport the unique passport number
 * @param username the name of the user
 * @author Maksim Merkulov
 * @version 1.0
 */
public record User(String passport, String username) {
}
