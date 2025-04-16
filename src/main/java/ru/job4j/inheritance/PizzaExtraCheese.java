package ru.job4j.inheritance;

/**
 * Класс {@code PizzaExtraCheese} расширяет {@link Pizza}, добавляя дополнительный сыр.
 *
 * <p>Метод {@link #name()} возвращает название пиццы с указанием добавки "extra cheese".</p>
 *
 * <p>Пример:
 * <pre>{@code
 * Pizza cheesy = new PizzaExtraCheese();
 * System.out.println(cheesy.name());    Just tasty pizza + extra cheese
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class PizzaExtraCheese extends Pizza {

    /**
     * Поле {@code EXTRA_CHEESE} содержит текст добавки "extra cheese" для названия пиццы.
     */
    private static final String EXTRA_CHEESE = "extra cheese";

    /**
     * Метод {@code name()} возвращает название пиццы с добавкой "extra cheese".
     *
     * @return Строка с названием пиццы и дополнительным сыром.
     */
    @Override
    public String name() {
        return super.name() + " + " + EXTRA_CHEESE;
    }
}
