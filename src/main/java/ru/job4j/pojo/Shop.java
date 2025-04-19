package ru.job4j.pojo;

/**
 * Класс {@code Shop} демонстрирует работу с массивом объектов {@link Product},
 * в котором не все элементы массива инициализированы.
 *
 * <p>Программа выполняет следующие действия:</p>
 * <ul>
 *     <li>Создает массив из 5 элементов типа {@link Product}.</li>
 *     <li>Заполняет первые три элемента: "Milk", "Bread", "Egg".</li>
 *     <li>Проходит по массиву и выводит названия товаров, проверяя на {@code null}.</li>
 * </ul>
 *
 * <p>Метод {@link #indexOfNull(Product[])} ищет первую пустую (null) ячейку в массиве и возвращает ее индекс.
 * Если пустых ячеек нет, возвращается {@code -1}.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Milk
 * Bread
 * Egg
 * }</pre>
 *
 * <p>Проверка на {@code null} необходима, так как не все элементы массива инициализированы.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-19
 */
public class Shop {

    /**
     * Метод {@code indexOfNull(Product[] products)} возвращает индекс первой пустой (null) ячейки в массиве продуктов.
     *
     * <p>Если все элементы массива инициализированы, метод возвращает {@code -1}.</p>
     *
     * @param products Массив продуктов {@link Product}.
     * @return Индекс первой {@code null}-ячейки или {@code -1}, если таких нет.
     */
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод {@code main(String[] args)} — точка входа в приложение.
     *
     * <p>Демонстрирует:</p>
     * <ul>
     *     <li>Создание массива из 5 продуктов, из которых инициализированы только 3.</li>
     *     <li>Вывод в консоль только инициализированных объектов, с проверкой на {@code null}.</li>
     * </ul>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}