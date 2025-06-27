package ru.job4j.tracker;

/**
 * Класс {@code StartUI} демонстрирует создание объекта {@link Item}
 * и вывод его строкового представления в консоль.
 *
 * <p>В методе {@link #main(String[])} создается объект {@link Item},
 * и результат его метода {@link Item#toString()} выводится в стандартный поток вывода.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Item item = new Item(1, "Bug report");
 * System.out.println(item);
 * }</pre>
 *
 * <p><b>Пример вывода (если переопределен метод toString):</b></p>
 * <pre>{@code
 * Item{id=1, name='Bug report', created=23-апреля-среда-2025 15:05:40}
 * }</pre>
 *
 * <p><b>Пример вывода (если toString() не переопределен):</b></p>
 * <pre>{@code
 * ru.job4j.tracker.Item@1a2b3c4d
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class StartUI {

    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Item item = new Item(1, "Bug report");
        System.out.println(item);
    }
}