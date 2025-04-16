package ru.job4j.inheritance;

/**
 * Класс {@code Pizza} представляет базовый вариант пиццы.
 *
 * <p>Метод {@link #name()} возвращает строку с названием пиццы без добавок.</p>
 *
 * <p>Пример:
 * <pre>{@code
 * Pizza base = new Pizza();
 * System.out.println(base.name());    Just tasty pizza
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class Pizza {

    /**
     * Метод {@code name()} возвращает название пиццы.
     *
     * @return Строка с базовым названием пиццы.
     */
    public String name() {
        return "Just tasty pizza";
    }
}