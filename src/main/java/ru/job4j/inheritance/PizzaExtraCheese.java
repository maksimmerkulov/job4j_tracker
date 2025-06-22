package ru.job4j.inheritance;

/**
 * Класс {@code PizzaExtraCheese} расширяет {@link Pizza}, добавляя дополнительный сыр.
 *
 * <p>Метод {@link #name()} возвращает название пиццы с указанием добавки "extra cheese".</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Pizza pizza = new PizzaExtraCheese();
 * System.out.println(pizza.name());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Just tasty pizza + extra cheese
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PizzaExtraCheese extends Pizza {

    /**
     * Дополнение к названию пиццы — дополнительный сыр.
     */
    private static final String EXTRA_CHEESE = "extra cheese";

    /**
     * Возвращает название пиццы с добавкой "extra cheese".
     *
     * @return Строка с названием пиццы и указанием дополнительного сыра.
     */
    @Override
    public String name() {
        return super.name() + " + " + EXTRA_CHEESE;
    }
}