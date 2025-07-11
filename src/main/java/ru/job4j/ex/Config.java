package ru.job4j.ex;

/**
 * Класс {@code Config} предоставляет функциональность загрузки конфигурации по заданному пути.
 *
 * <p>Используется для имитации загрузки конфигурационных данных по строке пути.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Config {

    /**
     * Загружает конфигурацию по указанному пути.
     *
     * <p>Если путь {@code null}, выбрасывается исключение.</p>
     *
     * @param path Путь к конфигурационному источнику.
     * @throws IllegalStateException если путь равен {@code null}.
     */
    public static void load(String path) {
        if (path == null) {
            throw new IllegalStateException("Path could not be null.");
        }
        System.out.println("load config by " + path);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Загружает конфигурацию с демонстрационным путем.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        load("jdbc://localhost:8080");
    }
}