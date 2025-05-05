package ru.job4j.tracker;

/**
 * Класс {@code StubOutput} представляет собой реализацию интерфейса {@link Output}
 * для имитации вывода в консоль во время тестирования.
 *
 * <p>Используется для перехвата и сохранения строк, передаваемых в {@code println()},
 * чтобы затем проверить их содержимое в тестах.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new StubOutput();
 * output.println("Hello");
 * System.out.println(output.toString());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Hello
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StubOutput implements Output {

    /**
     * Буфер для накопления строк вывода.
     */
    private final StringBuilder buffer = new StringBuilder();

    /**
     * Добавляет строковое представление объекта в буфер с переходом на новую строку.
     *
     * <p>Если объект {@code null}, добавляется строка {@code "null"}.</p>
     *
     * @param object объект, который требуется вывести.
     */
    @Override
    public void println(Object object) {
        if (object != null) {
            buffer.append(object.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    /**
     * Возвращает накопленный вывод в виде одной строки.
     *
     * @return все выведенные ранее строки, соединенные символами перевода строки.
     */
    @Override
    public String toString() {
        return buffer.toString();
    }
}