package ru.job4j.inheritance;

/**
 * Класс {@code PizzaShop} демонстрирует работу с различными вариантами пиццы.
 *
 * <p>Создаются базовая пицца, пицца с дополнительным сыром и пицца с дополнительным сыром и томатами.
 * Названия всех вариантов выводятся в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Pizza pizza = new Pizza();
 * PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
 * PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato();
 *
 * System.out.println(pizza.name());
 * System.out.println(pizzaExtraCheese.name());
 * System.out.println(pizzaExtraCheeseExtraTomato.name());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Just tasty pizza
 * Just tasty pizza + extra cheese
 * Just tasty pizza + extra cheese + extra tomato
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PizzaShop {

    /**
     * Создает и выводит в консоль названия трех вариантов пиццы:
     * <ul>
     *     <li>Базовая пицца</li>
     *     <li>Пицца с добавкой сыра</li>
     *     <li>Пицца с добавками сыра и томатов</li>
     * </ul>
     *
     * @param args аргументы командной строки (не используются)
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
