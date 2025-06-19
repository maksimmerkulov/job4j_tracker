package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс {@code Point} представляет точку на двумерной плоскости с координатами {@code x} и {@code y}.
 *
 * <p>Используется для геометрических вычислений, таких как расстояние между двумя точками.
 * Применяется, например, при построении треугольников и расчете их площади.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Point a = new Point(0, 0);
 * Point b = new Point(3, 4);
 * double dist = a.distance(b);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Point {

    /**
     * Координата {@code x} точки.
     */
    private int x;

    /**
     * Координата {@code y} точки.
     */
    private int y;

    /**
     * Конструктор с параметрами.
     * Создает точку с заданными координатами.
     *
     * @param first Координата {@code x} точки.
     * @param second Координата {@code y} точки.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Вычисляет расстояние между текущей точкой и указанной точкой {@code that}
     * на двумерной плоскости по формуле Евклидова расстояния.
     *
     * <p>Используется формула:</p>
     * <pre>{@code
     * √[(x1 - x2)² + (y1 - y2)²]
     * }</pre>
     *
     * <p>Где {@code x1}, {@code y1} — координаты текущей точки,
     * а {@code x2}, {@code y2} — координаты точки {@code that}.</p>
     *
     * @param that Точка, до которой нужно вычислить расстояние.
     * @return Расстояние между текущей точкой и точкой {@code that}.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
}