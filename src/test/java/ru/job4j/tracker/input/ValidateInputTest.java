package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import ru.job4j.tracker.output.*;

/**
 * Класс {@code ValidateInputTest} выполняет модульное тестирование класса {@link ValidateInput}.
 *
 * <p>Проверяет корректную обработку пользовательского ввода, включая обработку ошибок и повторный ввод.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ValidateInput input = new ValidateInput(new StubOutput(), new MockInput(...));
 * int result = input.askInt("Enter menu:");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class ValidateInputTest {

    /**
     * Проверка обработки некорректного ввода, за которым следует корректный.
     *
     * <p>Ожидается, что после ввода строки "one" будет показано сообщение об ошибке,
     * затем ввод "1" будет успешно распознан как число.</p>
     */
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    /**
     * Проверка корректной обработки одиночного валидного ввода.
     */
    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(new String[] {"1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    /**
     * Проверка последовательной обработки нескольких валидных вводов.
     *
     * <p>Метод проверяет, что значения корректно считываются одно за другим.</p>
     */
    @Test
    void whenMultipleValidInput() {
        String[] data = {"6", "5", "4", "3", "2", "1", "0"};
        int[] expected = {6, 5, 4, 3, 2, 1, 0};
        Output output = new StubOutput();
        Input in = new MockInput(data);
        ValidateInput input = new ValidateInput(output, in);
        for (int i = 0; i < data.length; i++) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(expected[i]);
        }
    }

    /**
     * Проверка обработки отрицательного числа как валидного ввода.
     */
    @Test
    void whenNegativeNumberInput() {
        Output output = new StubOutput();
        Input in = new MockInput(new String[] {"-1"});
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}