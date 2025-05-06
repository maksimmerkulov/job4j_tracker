package ru.job4j.tracker.output;

/**
 * Класс {@code ConsoleOutput} реализует интерфейс {@link Output} и используется
 * для вывода сообщений в консоль.
 *
 * <p>Этот класс предоставляет метод {@link #println(Object)} для вывода объекта в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * output.println("Сообщение для вывода в консоль");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение для вывода в консоль
 * }</pre>
 *
 * @author Maksим Merkulоv
 * @version 1.0
 */
public class ConsoleOutput implements Output {

    /**
     * Выводит объект в консоль.
     *
     * @param object объект, который нужно вывести в консоль.
     */
    @Override
    public void println(Object object) {
        System.out.println(object);
    }
}