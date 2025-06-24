package ru.job4j.pojo;

/**
 * Класс {@code Shop} демонстрирует работу с массивом объектов {@link Product},
 * в котором не все элементы инициализированы.
 *
 * <p>Программа выполняет следующие действия:</p>
 * <ul>
 *     <li>Создает массив из 5 элементов типа {@link Product}.</li>
 *     <li>Заполняет первые три элемента: "Milk", "Bread", "Egg".</li>
 *     <li>Проходит по массиву и выводит названия товаров, пропуская {@code null}-значения.</li>
 *     <li>Вызовом метода {@link #indexOfNull(Product[])} определяет индекс первой пустой ячейки.</li>
 * </ul>
 *
 * <p><b>Метод {@link #indexOfNull(Product[])}:</b></p>
 * <p>Ищет первую пустую (null) ячейку в массиве и возвращает ее индекс.</p>
 * <p>Если пустых ячеек нет, возвращает {@code -1}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product[] products = new Product[5];
 * products[0] = new Product("Milk", 10);
 * products[1] = new Product("Bread", 4);
 * products[2] = new Product("Egg", 19);
 * for (int i = 0; i < products.length; i++) {
 *     Product product = products[i];
 *     if (product != null) {
 *         System.out.println(product.getName());
 *     }
 * }
 *
 * int result = Shop.indexOfNull(products);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Milk
 * Bread
 * Egg
 *
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Shop {

    /**
     * Возвращает индекс первой {@code null}-ячейки в переданном массиве продуктов.
     *
     * <p>Если все ячейки массива заполнены (не {@code null}), возвращается {@code -1}.</p>
     *
     * @param products Массив объектов {@link Product}.
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
     * Точка входа в программу.
     *
     * <p>Создает массив продуктов, выводит все непустые элементы и определяет первую пустую ячейку.</p>
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
        System.out.println(indexOfNull(products));
    }
}