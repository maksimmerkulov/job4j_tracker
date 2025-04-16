package ru.job4j.inheritance;

/**
 * Класс {@code PizzaShop} демонстрирует работу с различными вариантами пиццы.
 *
 * <p>Создаются базовая пицца, пицца с сыром и пицца с сыром и томатами.
 * Каждый вариант выводится в консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-16
 */
public class PizzaShop {

    /**
     * Метод {@code main(String[] args)} создает и выводит в консоль названия трех вариантов пиццы:
     * <ul>
     *     <li>Базовая пицца</li>
     *     <li>Пицца с добавкой сыра</li>
     *     <li>Пицца с добавками сыра и томатов</li>
     * </ul>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}