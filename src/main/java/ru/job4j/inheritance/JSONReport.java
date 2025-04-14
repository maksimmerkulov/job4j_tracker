package ru.job4j.inheritance;

/**
 * Класс {@code JSONReport} наследуется от {@link TextReport} и генерирует отчет в формате JSON.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-14
 */
public class JSONReport extends TextReport {

    /**
     * Метод {@code generate(String name, String body)} генерирует отчет в формате JSON.
     *
     * @param name Имя.
     * @param body Тело отчета.
     * @return Cтрока с JSON.
     */
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\t\"name\" : \"" + name + "\","
                + System.lineSeparator()
                + "\t\"body\" : \"" + body + "\""
                + System.lineSeparator() + "}";
    }
}