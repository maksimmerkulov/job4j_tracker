package ru.job4j.inheritance;

/**
 * Класс {@code PizzaExtraCheeseExtraTomato} расширяет {@link PizzaExtraCheese},
 * добавляя к пицце дополнительные томаты.
 *
 * <p>Метод {@link #name()} возвращает название пиццы с указанием обеих добавок:
 * "extra cheese" и "extra tomato".</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Pizza pizza = new PizzaExtraCheeseExtraTomato();
 * System.out.println(pizza.name());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Just tasty pizza + extra cheese + extra tomato
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    /**
     * Дополнение к названию пиццы — дополнительные томаты.
     */
    private static final String EXTRA_TOMATO = "extra tomato";

    /**
     * Возвращает название пиццы с добавками "extra cheese" и "extra tomato".
     *
     * @return строка с названием пиццы и указанием дополнительного сыра и томатов
     */
    @Override
    public String name() {
        return super.name() + " + " + EXTRA_TOMATO;
    }
}
