package ru.job4j.tracker.input;

/**
 * Класс {@code MockInput} представляет имитацию пользовательского ввода
 * на основе заранее заданного массива строк.
 *
 * <p>Реализует интерфейс {@link Input} и используется в модульных тестах
 * для подстановки последовательности ответов без участия пользователя.</p>
 *
 * <p>При каждом вызове {@link #askStr(String)} возвращает очередной элемент
 * из массива {@code answers}. Метод {@link #askInt(String)} преобразует
 * его в целое число.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] predefined = {"test", "42"};
 * Input input = new MockInput(predefined);
 *
 * String name = input.askStr("Введите имя: ");
 * int id = input.askInt("Введите число: ");
 * System.out.println(name);
 * System.out.println(id);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * test
 * 42
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 * @see Input
 */
public class MockInput implements Input {

    /**
     * Массив заранее заданных ответов.
     */
    private String[] answers;

    /**
     * Текущая позиция в массиве ответов.
     */
    private int position = 0;

    /**
     * Создает объект {@code MockInput} с заданными ответами.
     *
     * @param answers массив строковых ответов, которые будут возвращаться последовательно
     */
    public MockInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Возвращает следующий строковый ответ из массива.
     *
     * <p>Игнорирует переданный вопрос. При каждом вызове возвращает следующий элемент массива {@code answers}.</p>
     *
     * @param question игнорируемый вопрос
     * @return следующий строковый ответ
     */
    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    /**
     * Возвращает следующий ответ из массива как целое число.
     *
     * <p>Внутри вызывает {@link #askStr(String)} и преобразует результат в {@code int}.</p>
     *
     * @param question игнорируемый вопрос
     * @return следующий ответ как {@code int}
     * @throws NumberFormatException если строка не может быть преобразована в число
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
