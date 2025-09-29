package ru.job4j.inheritance;

/**
 * A text report model providing simple formatting capabilities.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TextReport {

    /**
     * Returns a report with a name and a body.
     *
     * @param name the report name
     * @param body the report body
     * @return the formatted report string
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
