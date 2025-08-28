package ru.job4j.tracker.output;

/**
 * Интерфейс {@code Output} определяет контракт для вывода сообщений.
 *
 * <p>Используется для абстрагирования способов вывода — в консоль, буфер,
 * лог и т.д. Позволяет реализовать разные стратегии отображения информации
 * пользователю или перехвата вывода для тестирования.</p>
 *
 * <p><b>Основные реализации:</b></p>
 * <ul>
 *     <li>{@link ConsoleOutput} — вывод в консоль.</li>
 *     <li>{@link StubOutput} — захват вывода в буфер (для тестов).</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * output.println("Программа запущена");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public interface Output {

    /**
     * Выводит строковое представление объекта.
     *
     * @param object объект, который необходимо отобразить
     */
    void println(Object object);
}
