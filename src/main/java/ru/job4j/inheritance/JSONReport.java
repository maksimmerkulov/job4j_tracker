package ru.job4j.inheritance;

/**
 * A JSON report model extending the base {@link TextReport} generator.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class JSONReport extends TextReport {

    /**
     * Returns a report in a JSON-like structure.
     *
     * @param name the report name
     * @param body the report body
     * @return the formatted JSON report string
     */
    @Override
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{" + ln
                + "\t\"name\" : \"" + name + "\"," + ln
                + "\t\"body\" : \"" + body + "\"" + ln
                + "}";
    }
}
