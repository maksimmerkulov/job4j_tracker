package ru.job4j.tracker.output;

/**
 * Класс {@code StubOutput} реализует интерфейс {@link Output} и используется
 * для захвата текстового вывода в строковый буфер.
 *
 * <p>Применяется в модульных тестах для проверки выводимых сообщений,
 * имитируя поведение {@link ConsoleOutput}, но не печатая в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new StubOutput();
 * output.println("Hello");
 * assertThat(output.toString()).contains("Hello");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @see Output
 * @see ConsoleOutput
 */
public class StubOutput implements Output {

    /**
     * Буфер для накопления строк вывода.
     */
    private final StringBuilder buffer = new StringBuilder();

    /**
     * Добавляет строковое представление объекта в буфер, а затем перевод строки.
     *
     * <p>Если объект {@code null}, добавляется строка {@code "null"}.</p>
     *
     * @param object объект, который необходимо вывести
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
     * Возвращает содержимое буфера вывода в виде строки.
     *
     * @return все выведенные строки, разделенные символами перевода строки
     */
    @Override
    public String toString() {
        return buffer.toString();
    }
}
