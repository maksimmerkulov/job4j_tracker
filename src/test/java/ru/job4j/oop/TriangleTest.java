package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

/**
 * Tests for the {@link Triangle} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class TriangleTest {

    /**
     * Verifies the area calculation for a valid triangle.
     */
    @Test
    void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    /**
     * Verifies that area is {@code -1} when the triangle cannot be formed.
     */
    @Test
    void when00and40and80ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(8, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
