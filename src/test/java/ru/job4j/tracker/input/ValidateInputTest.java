package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ValidateInputTest} выполняет модульное тестирование класса {@link ValidateInput}.
 *
 * <p>Проверяет корректную обработку пользовательского ввода, включая обработку ошибок и повторный ввод.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Output output = new StubOutput();
 * Input in = new MockInput(
 *         new String[] {"one", "1"}
 * );
 * ValidateInput input = new ValidateInput(output, in);
 * int selected = input.askInt("Enter menu:");
 * assertThat(selected).isEqualTo(1);
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
        int selected;
        Output output = new StubOutput();
        Input in = new MockInput(new String[] {"0", "1", "2", "3", "4", "5", "6"});
        ValidateInput input = new ValidateInput(output, in);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(4);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(5);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(6);
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