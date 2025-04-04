package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

/**
 * Тест-класс {@code TriangleTest} содержит юнит-тесты для класса {@link Triangle}.
 *
 * <p>Тестирует функциональность метода {@link Triangle#area()}, который вычисляет площадь треугольника, проверяя,
 * существует ли треугольник по заданным точкам.
 * Если треугольник существует, возвращается его площадь, иначе возвращается -1.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-03
 */
public class TriangleTest {

    /**
     * Тестирует вычисление площади треугольника с вершинами в точках (0, 0), (4, 0) и (0, 4).
     * Ожидаемый результат: площадь треугольника = 8.
     */
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    /**
     * Тестирует ситуацию, когда все точки треугольника лежат на одной прямой.
     * В этом случае треугольник не существует, ожидаемый результат: -1.
     */
    @Test
    public void whenPointsOnOneLineThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует случай, когда два из трех пунктов совпадают, что делает треугольник невозможным.
     * Ожидаемый результат: -1.
     */
    @Test
    public void whenNegativeAreaThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует вычисление площади для валидного треугольника с вершинами в точках (0, 0), (4, 0) и (0, 3).
     * Ожидаемый результат: площадь треугольника = 6.
     */
    @Test
    public void whenValidTriangleThenArea() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}