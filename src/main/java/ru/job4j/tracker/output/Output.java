package ru.job4j.tracker.output;

/**
 * Интерфейс {@code Output} определяет способ вывода информации пользователю.
 *
 * <p>Реализации этого интерфейса могут обеспечивать вывод в консоль, файл, лог и другие цели.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * output.println("Сообщение пользователю");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение пользователю
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Output {

    /**
     * Выводит объект пользователю.
     *
     * <p>Обычно используется для отображения сообщений, результатов операций и ошибок.</p>
     *
     * @param object объект, который необходимо вывести. Метод вызывает {@code toString()} у объекта.
     */
    void println(Object object);
}