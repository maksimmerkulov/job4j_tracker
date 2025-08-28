package ru.job4j.tracker.input;

import ru.job4j.tracker.output.Output;

/**
 * Класс {@code ValidateInput} реализует обертку над {@link Input}, добавляющую
 * проверку корректности пользовательского ввода при запросе целого числа.
 *
 * <p>Используется для безопасного ввода целочисленных значений от пользователя,
 * предотвращая выброс {@link NumberFormatException} в случае некорректного ввода.</p>
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
 * @version 1.2
 */
public class ValidateInput implements Input {

    /**
     * Интерфейс для вывода сообщений пользователю, включая сообщения об ошибках.
     */
    private final Output output;

    /**
     * Интерфейс ввода, оборачиваемый с добавлением логики валидации.
     */
    private final Input input;

    /**
     * Создает экземпляр {@code ValidateInput}.
     *
     * @param output объект для вывода сообщений пользователю
     * @param input  объект для получения пользовательского ввода
     */
    public ValidateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    /**
     * Запрашивает у пользователя строку без дополнительной валидации.
     *
     * @param question сообщение, выводимое пользователю
     * @return строка, введенная пользователем
     */
    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    /**
     * Запрашивает у пользователя целое число с валидацией.
     *
     * <p>Если пользователь вводит некорректное значение (например, строку),
     * выводится сообщение об ошибке и повторяется запрос до успешного ввода числа.</p>
     *
     * @param question сообщение, выводимое пользователю
     * @return целое число, введенное пользователем
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
