package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс {@code Point} представляет точку на двумерной плоскости с координатами {@code x} и {@code y}.
 * Включает метод для вычисления расстояния между двумя точками.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-03
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
     * Конструктор {@code Point(int first, int second)} инициализирует точку с заданными координатами.
     *
     * @param first Координата {@code x} точки.
     * @param second Координата {@code y} точки.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод {@code distance(Point that)} вычисляет расстояние между текущей точкой и точкой {@code that}.
     *
     * @param that Точка, с которой вычисляется расстояние.
     * @return Расстояние между двумя точками.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
}