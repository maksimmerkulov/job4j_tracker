package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code JSONReportTest} для тестирования {@link JSONReport}.
 * Содержит методы для проверки корректности работы генерации отчетов в формате JSON.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-14
 */
public class JSONReportTest {

    /**
     * Тестирование метода {@link JSONReport#generate(String, String)} с обычными строками.
     * Проверяется корректность генерации JSON-отчета с именем и телом отчета.
     */
    @Test
    public void whenTestGenerateMethod() {
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
     * Тестирование метода {@link JSONReport#generate(String, String)} с именем и телом,
     * содержащими более сложные строки. Проверяется корректность генерации JSON-отчета.
     */
    @Test
    public void whenNameIsDavidBodyIsNameSong() {
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