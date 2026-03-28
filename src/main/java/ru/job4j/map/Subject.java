package ru.job4j.map;

/**
 * Subject data record representing a study discipline and its score.
 *
 * @param name  the subject name
 * @param score the score received for the subject
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Subject(String name, int score) {
}
