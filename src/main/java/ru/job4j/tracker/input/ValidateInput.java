package ru.job4j.tracker.input;

/**
 * Класс {@code ValidateInput} расширяет {@link ConsoleInput} и добавляет валидацию ввода.
 *
 * <p>Используется для повторного запроса ввода от пользователя, если введенное значение
 * не является целым числом. Предотвращает выброс {@link NumberFormatException}, перехватывая
 * исключение и запрашивая ввод повторно.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ValidateInput();
 * int select = input.askInt("Выбрать: ");
 * }</pre>
 *
 * <p><b>Пример вывода при некорректном вводе:</b></p>
 * <pre>{@code
 * Выбрать: abc
 * Пожалуйста, введите корректные данные
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ValidateInput extends ConsoleInput {

    /**
     * Запрашивает у пользователя ввод целого числа с проверкой корректности.
     *
     * <p>Если пользователь вводит нечисловое значение, метод выведет сообщение
     * об ошибке и повторно запросит ввод.</p>
     *
     * @param question вопрос, отображаемый пользователю.
     * @return введенное пользователем целое число.
     */
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }
}