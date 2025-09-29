package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link JSONReport} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class JSONReportTest {

    /**
     * Verifies that the generate method returns a correct JSON-like string.
     */
    @Test
    void whenTestGenerateMethod() {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"Report's name\"," + ln
                + "\t\"body\" : \"Report's body\"" + ln
                + "}";
        String name = "Report's name";
        String body = "Report's body";
        String result = new JSONReport().generate(name, body);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the generate method with custom artist and song data.
     */
    @Test
    void whenNameIsDavidBodyIsNameSong() {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"David Gilmour\"," + ln
                + "\t\"body\" : \"Shine On You Crazy Diamond\"" + ln
                + "}";
        String name = "David Gilmour";
        String body = "Shine On You Crazy Diamond";
        String result = new JSONReport().generate(name, body);
        assertThat(result).isEqualTo(expected);
    }
}
