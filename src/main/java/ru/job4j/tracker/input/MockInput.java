package ru.job4j.tracker.input;

/**
 * Класс {@code MockInput} представляет собой имитацию пользовательского ввода для тестирования.
 *
 * <p>Используется для автоматизации ввода при тестировании классов, использующих интерфейс {@link Input}.
 * Позволяет подставлять заранее заданные ответы вместо ввода с клавиатуры.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC"};
 * Input input = new MockInput(answers);
 * String name = input.askStr("Введите имя: ");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Fix PC
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class MockInput implements Input {

    /**
     * Массив заранее заданных ответов.
     */
    private final String[] answers;

    /**
     * Текущая позиция в массиве ответов.
     */
    private int position = 0;

    /**
     * Создает объект {@code MockInput} с заданными ответами.
     *
     * @param answers массив строковых ответов, которые будут возвращаться последовательно.
     */
    public MockInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Возвращает следующий строковый ответ из массива.
     *
     * <p>Игнорирует переданный вопрос. При каждом вызове возвращает следующий элемент массива {@code answers}.</p>
     *
     * @param question игнорируемый вопрос.
     * @return следующий строковый ответ.
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
     * @param question игнорируемый вопрос.
     * @return следующий ответ как {@code int}.
     * @throws NumberFormatException если строка не может быть преобразована в число.
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}