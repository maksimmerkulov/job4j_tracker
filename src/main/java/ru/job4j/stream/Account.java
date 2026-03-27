package ru.job4j.stream;

/**
 * Account model representing a bank account.
 *
 * @param requisite the unique account requisite
 * @param balance   the current balance
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Account(String requisite, double balance) {
}
