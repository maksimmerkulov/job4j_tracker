package ru.job4j.pojo;

/**
 * Класс {@code Store} демонстрирует работу с массивом объектов класса {@link Product}.
 *
 * <p>Создаются несколько продуктов, добавляются в массив, выводятся на экран.</p>
 * <p>Затем происходит замена одного из продуктов, и снова производится вывод.</p>
 * <p>В конце отображаются только те продукты, количество которых больше 10.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product milk = new Product("Milk", 10);
 * Product bread = new Product("Bread", 4);
 * Product egg = new Product("Egg", 19);
 * Product[] products = new Product[3];
 * products[0] = milk;
 * products[1] = bread;
 * products[2] = egg;
 * for (int index = 0; index < products.length; index++) {
 * Product product = products[index];
 * System.out.println(product.getName() + " - " + product.getCount());
 * }
 *
 * System.out.println("Replace milk to oil.");
 * Product oil = new Product("Oil", 11);
 * products[0] = oil;
 * for (int index = 0; index < products.length; index++) {
 * Product product = products[index];
 * System.out.println(product.getName() + " - " + product.getCount());
 * }
 *
 * System.out.println("Shown only product.count > 10");
 * for (int index = 0; index < products.length; index++) {
 * Product product = products[index];
 * if (product.getCount() > 10) {
 * System.out.println(product.getName() + " - " + product.getCount());
 * }
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Milk - 10
 * Bread - 4
 * Egg - 19
 *
 * Replace milk to oil.
 * Oil - 11
 * Bread - 4
 * Egg - 19
 *
 * Shown only product.count > 10
 * Oil - 11
 * Egg - 19
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Store {

    /**
     * Точка входа в программу.
     *
     * <p>Создает массив продуктов, выводит их, заменяет один элемент,
     * затем фильтрует и отображает продукты с количеством более 10.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product.getCount() > 10) {
                System.out.println(product.getName() + " - " + product.getCount());
            }
        }
    }
}
