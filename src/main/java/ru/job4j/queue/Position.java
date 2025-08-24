package ru.job4j.queue;

/**
 * Перечисление {@code Position} представляет должности в организации.
 *
 * <p>Элементы перечисления расположены в порядке убывания ранга:
 * {@link #DIRECTOR}, {@link #DEPUTY_DIRECTOR}, {@link #DEPARTMENT_HEAD}, {@link #MANAGER}.</p>
 *
 * <p>Используется для сортировки задач по должности в {@link Task}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Position position = Position.DIRECTOR;
 * if (position == Position.MANAGER) {
 *     System.out.println("Это менеджер.");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Это менеджер.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public enum Position {
    DIRECTOR,
    DEPUTY_DIRECTOR,
    DEPARTMENT_HEAD,
    MANAGER
}
