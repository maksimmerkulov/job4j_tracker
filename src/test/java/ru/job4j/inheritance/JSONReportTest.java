package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code JSONReportTest} содержит модульные тесты для метода
 * {@link JSONReport#generate(String, String)}.
 *
 * <p>Тесты проверяют корректность формирования JSON-строки на основе входных параметров
 * {@code name} и {@code body}. Используется AssertJ для проверки равенства результатов.</p>
 *
 * <p><b>Покрытие тестами:</b></p>
 * <ul>
 *     <li>Проверка генерации JSON с тестовыми данными.</li>
 *     <li>Проверка генерации JSON с конкретными значениями (музыкальный пример).</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String ln = System.lineSeparator();
 * String expected = "{" + ln
 * + "\t\"name\" : \"David Gilmour\"," + ln
 * + "\t\"body\" : \"Shine On You Crazy Diamond\"" + ln
 * + "}";
 * String name = "David Gilmour";
 * String body = "Shine On You Crazy Diamond";
 * String result = new JSONReport().generate(name, body);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JSONReportTest {

    /**
     * Тестирует генерацию JSON-отчета с шаблонными значениями "Report's name" и "Report's body".
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
     * Тестирует генерацию JSON-отчета с данными "David Gilmour" и "Shine On You Crazy Diamond".
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