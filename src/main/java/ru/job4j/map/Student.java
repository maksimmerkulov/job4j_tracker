package ru.job4j.map;

/**
 * Student data record representing a person in the college system.
 *
 * @param name    the full name of the student
 * @param account the unique account identifier
 * @param group   the student's study group
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Student(String name, String account, String group) {
}
