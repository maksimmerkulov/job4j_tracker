package ru.job4j.inheritance;

/**
 * Generates reports in HTML format.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class HtmlReport extends TextReport {

    /**
     * Generates a report with HTML tags.
     *
     * @param name the report name
     * @param body the report body
     * @return the formatted HTML report string
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}
