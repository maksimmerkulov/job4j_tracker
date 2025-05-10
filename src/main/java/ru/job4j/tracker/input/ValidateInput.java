package ru.job4j.tracker.input;

import ru.job4j.tracker.output.*;

/**
 * Класс {@code ValidateInput} реализует обертку над {@link Input} с проверкой ввода чисел.
 *
 * <p>Используется для безопасного ввода целочисленных значений от пользователя,
 * предотвращая выброс {@link NumberFormatException} в случае некорректного ввода.</p>
 *
 * <p>В случае ввода недопустимого значения пользователь получает сообщение об ошибке
 * и повторный запрос до тех пор, пока не введет корректное число.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * Input input = new ValidateInput(output, new ConsoleInput());
 * int select = input.askInt("Выбрать: ");
 * }</pre>
 *
 * <p><b>Пример вывода при ошибке:</b></p>
 * <pre>{@code
 * Выбрать: abc
 * Пожалуйста, введите корректные данные
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ValidateInput implements Input {

    /**
     * Интерфейс вывода, используемый для отображения сообщений об ошибках.
     */
    private final Output output;

    /**
     * Интерфейс ввода, который оборачивается с добавлением проверки.
     */
    private final Input input;

    /**
     * Конструктор, инициализирующий обертку для валидации числового ввода.
     *
     * @param output интерфейс вывода сообщений (например, {@link ru.job4j.tracker.output.ConsoleOutput}).
     * @param input  исходный ввод, например {@link ConsoleInput}.
     */
    public ValidateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    /**
     * Запрашивает у пользователя строку без дополнительной валидации.
     *
     * @param question вопрос, отображаемый пользователю.
     * @return введенная пользователем строка.
     */
    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    /**
     * Запрашивает у пользователя ввод целого числа с проверкой корректности.
     *
     * <p>Если пользователь вводит нечисловое значение, метод выведет сообщение
     * об ошибке и повторно запросит ввод.</p>
     *
     * @param question вопрос, отображаемый пользователю.
     * @return введенное пользователем целое число.
     * @throws NumberFormatException если исходный {@link Input} не проверяет ввод.
     */
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = input.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                output.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }
}