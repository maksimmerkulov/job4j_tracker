package ru.job4j.inheritance;

/**
 * A main runner class demonstrating the usage of the {@link HtmlReport}.
 *
 * <p>Example output:
 * <pre>{@code
 * <h1>Report's name</h1><br/><span>Report's body</span>
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ReportUsage {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
