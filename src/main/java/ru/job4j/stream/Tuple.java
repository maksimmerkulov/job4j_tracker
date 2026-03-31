package ru.job4j.stream;

/**
 * Result tuple for statistical analysis.
 *
 * @param name  the entity name
 * @param score the calculated score
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Tuple(String name, double score) {
}
