package ru.job4j.ex;

/**
 * Класс {@code FindMaxLength} находит максимальную длину строки в массиве,
 * содержащем строки и {@code null}-значения.
 *
 * <p>Используется для демонстрации обработки {@code null}-элементов в массивах,
 * а также безопасного вызова методов у объектов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FindMaxLength.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Max length : 6
 * }</pre>
 *
 * <p><b>Что происходит:</b></p>
 * <ul>
 *   <li>Перебираются все элементы массива.</li>
 *   <li>Если элемент не {@code null}, сравнивается его длина с текущим максимумом.</li>
 *   <li>{@code null}-элементы пропускаются во избежание {@link NullPointerException}.</li>
 * </ul>
 *
 * <p><b>Пример некорректного кода, вызывающего исключение {@link NullPointerException}:</b></p>
 * <pre>{@code
 * if (element.length() > max) {
 *     max = element.length();
 * }
 * }</pre>
 *
 * <p><b>Правильный вариант:</b></p>
 * <pre>{@code
 * if (element != null && element.length() > max) {
 *     max = element.length();
 * }
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FindMaxLength {

    /**
     * Точка входа в программу.
     *
     * <p>Находит максимальную длину строки среди непустых элементов массива {@code shops}.</p>
     *
     * <p>Игнорирует {@code null}-значения, чтобы избежать {@link NullPointerException}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String element = shops[index];
            if (element != null && element.length() > max) {
                max = element.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}