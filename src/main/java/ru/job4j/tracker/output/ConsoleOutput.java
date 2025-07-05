package ru.job4j.tracker.output;

/**
 * Класс {@code ConsoleOutput} реализует интерфейс {@link Output}
 * и выводит сообщения в стандартный поток вывода (консоль).
 *
 * <p>Применяется в основном приложении для отображения информации
 * пользователю в реальном времени через {@link System#out}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * output.println("Добро пожаловать!");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @see Output
 * @see StubOutput
 */
public class ConsoleOutput implements Output {

    /**
     * Выводит объект в стандартный поток вывода.
     *
     * @param object Объект, который необходимо вывести.
     */
    @Override
    public void println(Object object) {
        System.out.println(object);
    }
}