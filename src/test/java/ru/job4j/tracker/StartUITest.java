package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} представляет собой модульный тест для проверки логики добавления элементов в трекер.
 *
 * <p>Используется для тестирования метода {@link StartUI#createItem(Input, Tracker)}, который добавляет новые элементы
 * в хранилище {@link Tracker} на основе пользовательского ввода.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC", "Fix Bug"};
 * Input input = new MockInput(answers);
 * Tracker tracker = new Tracker();
 * StartUI.createItem(input, tracker);
 * StartUI.createItem(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Item name = Fix PC
 * Item name = Fix Bug
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-05-02
 */
class StartUITest {

    /**
     * Проверяет, что при добавлении элементов через {@link StartUI#createItem(Input, Tracker)}
     * они корректно сохраняются в {@link Tracker} с ожидаемыми именами.
     *
     * <p>Создается {@link MockInput} с двумя строками: "Fix PC" и "Fix Bug".
     * Метод {@link StartUI#createItem(Input, Tracker)} вызывается дважды,
     * и оба элемента должны быть добавлены в трекер.
     * Затем имена сохраненных элементов сравниваются с ожидаемыми значениями.</p>
     *
     * @apiNote Использует {@link MockInput} для имитации пользовательского ввода.
     * @implSpec Сравнение выполняется с использованием библиотеки AssertJ.
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