package ru.job4j.inheritance;

/**
 * Класс {@code TextReport} представляет собой генератор текстовых отчетов.
 * Метод {@link #generate(String, String)} формирует текстовый отчет на основе имени и тела отчета.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-14
 */
public class TextReport {

    /**
     *  Метод {@code generate(String name, String body)} генерирует текстовый отчет.
     * <p>
     * Формирует строку отчета, состоящая из имени и его тела.
     * Каждая часть отчета разделена переносом строки.
     * </p>
     *
     * @param name Имя отчета.
     * @param body Тело отчета.
     * @return Строка, содержащая отчет с разделением имени и тела на отдельные строки.
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}