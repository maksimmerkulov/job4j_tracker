package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} содержит модульные тесты для проверки поведения методов {@link StartUI}.
 *
 * <p>Используется для проверки корректности операций добавления заявок в {@link Tracker}
 * с использованием подставного ввода через {@link MockInput}.</p>
 *
 * <p><b>Пример сценария:</b></p>
 * <ul>
 *     <li>Создание заявки через {@link StartUI#createItem(Input, Tracker)}.</li>
 *     <li>Проверка, что заявка действительно была добавлена в хранилище с ожидаемым именем.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC"};
 * Input input = new MockInput(answers);
 * Tracker tracker = new Tracker();
 * StartUI.createItem(input, tracker);
 * Item created = tracker.findAll()[0];
 * Item expected = new Item("Fix PC");
 * assertThat(created.getName()).isEqualTo(expected.getName());
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class StartUITest {

    /**
     * Тест проверяет добавление новой заявки через {@link StartUI#createItem(Input, Tracker)}.
     *
     * <p>Проверяется, что созданный элемент в {@link Tracker} содержит ожидаемое имя.</p>
     *
     * <p><b>Ожидаемый результат:</b> заявка с именем {@code "Fix PC"} будет добавлена
     * и доступна через {@code tracker.findAll()}.</p>
     */
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }
}