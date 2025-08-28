package ru.job4j.inheritance;

/**
 * Класс {@code Pizza} представляет базовый вариант пиццы.
 *
 * <p>Метод {@link #name()} возвращает стандартное название пиццы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Pizza pizza = new Pizza();
 * System.out.println(pizza.name());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Just tasty pizza
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Pizza {

    /**
     * Возвращает название пиццы.
     *
     * @return строка с базовым названием пиццы
     */
    public String name() {
        return "Just tasty pizza";
    }
}
