package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} представляет собой модульный тест для проверки логики добавления элемента в трекер.
 *
 * <p>Используется для тестирования метода {@link StartUI#createItem(Input, Tracker)}, который добавляет новый элемент
 * в хранилище {@link Tracker} на основе пользовательского ввода.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC"};
 * Input input = new MockInput(answers);
 * Tracker tracker = new Tracker();
 * StartUI.createItem(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Item name = Fix PC
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-05-02
 */
class StartUITest {

    /**
     * Тест проверяет, что при добавлении элемента через {@link StartUI#createItem(Input, Tracker)},
     * он сохраняется в {@link Tracker} с ожидаемым именем.
     *
     * <p>Создается мок ввода, содержащий имя задачи. Метод {@link StartUI#createItem(Input, Tracker)}
     * добавляет эту задачу в трекер, после чего осуществляется сравнение имени фактически добавленного
     * элемента с ожидаемым.</p>
     *
     * @apiNote Использует {@link MockInput} для симуляции пользовательского ввода.
     * @implSpec Сравнение выполняется с использованием библиотеки AssertJ.
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