package ru.job4j.condition;

/**
 * Класс {@code Max} содержит метод для нахождения максимального из двух чисел.
 *
 * <p>Метод {@link Max#max(int, int)} используется для определения наибольшего
 * числа между двумя переданными значениями.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int result = Max.max(5, 10);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 10
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Max {

    /**
     * Возвращает максимальное из двух чисел.
     *
     * <p>Если оба значения равны — возвращается любое из них.</p>
     *
     * @param left  первое число
     * @param right второе число
     * @return наибольшее из двух чисел
     */
    public static int max(int left, int right) {
        int max = left;
        if (left < right) {
            max = right;
        }
        return max;
    }
}
