package ru.job4j.early;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@code Example1} рассчитывает значения обратно пропорциональной функции {@code y = k / x}
 * на равномерно распределенных отрезках между двумя точками.
 *
 * <p>Используется для вычисления списка значений функции в заданном диапазоне с контролем параметров.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Double> values = Example1.calculateInverseProportionality(2.0, 1.0, 4.0, 3);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [2.0, 1.333..., 1.0]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Example1 {

    /**
     * Погрешность сравнения чисел с плавающей точкой.
     */
    private static final double COMPARING_PRECISION = 1.e-5;

    /**
     * Вычисляет значения функции {@code y = k / x} в заданном диапазоне.
     *
     * <p>Равномерно делит отрезок от {@code x1} до {@code x2} на {@code n} точек и
     * вычисляет соответствующие значения функции. Внутри используется сравнение с
     * погрешностью и проверка согласованности параметров.</p>
     *
     * @param k коэффициент обратной пропорциональности
     * @param x1 левая граница диапазона
     * @param x2 правая граница диапазона
     * @param n количество точек
     * @return список значений функции {@code y = k / x}
     * @throws IllegalArgumentException если {@code k == 0}, {@code n <= 0},
     *         {@code x1 == x2} при {@code n > 1}, или параметры не согласованы
     */
    public static List<Double> calculateInverseProportionality(double k, double x1, double x2, int n) {
        if (isEquals(k, 0)) {
            throw new IllegalArgumentException("'k' must be more than 0");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("'n' must be more than 0");
        }
        if (k > 0 && x1 > x2 || k < 0 && x2 < x1) {
            throw new IllegalArgumentException("k is not consistent with x1 and x2");
        }
        if (isEquals(x1, x2) && n > 1) {
            throw new IllegalArgumentException("n suppose more than one point, but range include one point");
        }
        return calculateFunction(k, Math.min(x1, x2), Math.max(x1, x2), n);
    }

    /**
     * Сравнивает два значения с учетом допустимой погрешности.
     *
     * @param a первое число
     * @param b второе число
     * @return {@code true}, если числа практически равны
     */
    private static boolean isEquals(double a, double b) {
        return Math.abs(a - b) < COMPARING_PRECISION;
    }

    /**
     * Выполняет вычисления функции {@code y = k / x} на равномерных отрезках.
     *
     * @param k коэффициент обратной пропорциональности
     * @param x1 левая граница диапазона
     * @param x2 правая граница диапазона
     * @param n количество точек
     * @return список значений функции {@code y = k / x}
     */
    private static List<Double> calculateFunction(double k, double x1, double x2, int n) {
        List<Double> result = new ArrayList<>(n);
        double step = (x2 - x1) / n;
        for (int i = 0; i < n; i++) {
            double xi = x1 + i * step;
            double yi = k / xi;
            result.add(yi);
        }
        return result;
    }
}
