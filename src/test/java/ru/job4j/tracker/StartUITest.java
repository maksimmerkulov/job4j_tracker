package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} содержит модульные тесты для проверки поведения методов {@link StartUI}.
 *
 * <p>Используется для проверки корректности операций добавления заявок в {@link Tracker}
 * с использованием подставного ввода через {@link MockInput}.</p>
 *
 * <p><b>Сценарий тестирования:</b></p>
 * <ul>
 *     <li>Создание двух заявок через {@link StartUI#createItem(Input, Tracker)}.</li>
 *     <li>Проверка, что обе заявки добавлены с корректными именами в правильном порядке.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC", "Fix Bug"};
 * Input input = new MockInput(answers);
 * Tracker tracker = new Tracker();
 * StartUI.createItem(input, tracker);
 * StartUI.createItem(input, tracker);
 *
 * Item first = tracker.findAll()[0];
 * Item second = tracker.findAll()[1];
 *
 * assertThat(first.getName()).isEqualTo("Fix PC");
 * assertThat(second.getName()).isEqualTo("Fix Bug");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class StartUITest {

    /**
     * Тест проверяет последовательное добавление двух заявок через {@link StartUI#createItem(Input, Tracker)}.
     *
     * <p>Ожидаемый результат: заявки с именами {@code "Fix PC"} и {@code "Fix Bug"} добавлены
     * в хранилище в заданном порядке.</p>
     */
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC", "Fix Bug"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
        created = tracker.findAll()[1];
        expected = new Item("Fix Bug");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }
}