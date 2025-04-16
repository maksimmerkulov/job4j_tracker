package ru.job4j.inheritance;

/**
 * Класс {@code PizzaExtraCheeseExtraTomato} расширяет {@link PizzaExtraCheese},
 * добавляя к пицце дополнительные томаты.
 *
 * <p>Метод {@link #name()} возвращает название пиццы с указанием обеих добавок.</p>
 *
 * <p>Пример:
 * <pre>{@code
 * Pizza full = new PizzaExtraCheeseExtraTomato();
 * System.out.println(full.name());    Just tasty pizza + extra cheese + extra tomato
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    /**
     * Поле {@code EXTRA_TOMATO} содержит текст добавки "extra tomato" для названия пиццы.
     */
    private static final String EXTRA_TOMATO = "extra tomato";

    /**
     * Метод {@code name()} возвращает название пиццы с добавками "extra cheese" и "extra tomato".
     *
     * @return Строка с полным названием пиццы.
     */
    @Override
    public String name() {
        return super.name() + " + " + EXTRA_TOMATO;
    }
}
