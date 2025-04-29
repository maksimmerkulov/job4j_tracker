package ru.job4j.polymorphism;

/**
 * Класс {@code MainFunctionMessage} содержит точку входа в программу.
 *
 * <p>В нем создается объект {@link FunctionMessage} и вызывается метод
 * {@link FunctionMessage#functionMessage()}, который выводит сообщение,
 * реализованное в интерфейсе {@link FunctionTwo}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * MainFunctionMessage.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение из FunctionTwo
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public class MainFunctionMessage {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link FunctionMessage} и вызывает метод {@link FunctionMessage#functionMessage()}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        FunctionMessage functionMessage = new FunctionMessage();
        functionMessage.functionMessage();
    }
}