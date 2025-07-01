package ru.job4j.tracker;

/**
 * Класс {@code MockInput} представляет заглушку для пользовательского ввода.
 *
 * <p>Реализует интерфейс {@link Input} и возвращает фиксированные значения —
 * {@code null} для строк и {@code 0} для чисел. Используется для тестирования
 * компонентов, зависящих от ввода, без реального взаимодействия с пользователем.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new MockInput();
 * String answer = input.askStr("Введите имя:");
 * int number = input.askInt("Введите число:");
 * System.out.println("Ответ на строковый вопрос: " + answer);
 * System.out.println("Ответ на числовой вопрос: " + number);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ответ на строковый вопрос: null
 * Ответ на числовой вопрос: 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see Input
 */
public class MockInput implements Input {

    /**
     * Возвращает {@code null} независимо от переданного вопроса.
     *
     * @param question Текст вопроса (игнорируется).
     * @return Значение {@code null}.
     */
    @Override
    public String askStr(String question) {
        return null;
    }

    /**
     * Возвращает {@code 0} независимо от переданного вопроса.
     *
     * @param question Текст вопроса (игнорируется).
     * @return Значение {@code 0}.
     */
    @Override
    public int askInt(String question) {
        return 0;
    }
}