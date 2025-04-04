package ru.job4j.oop;

/**
 * Класс {@code Triangle} представляет треугольник, определенный тремя точками.
 * Включает методы для вычисления полупериметра, проверки существования треугольника
 * и вычисления его площади.
 *
 * <p>Класс использует метод Герона для вычисления площади треугольника, если он существует.
 * Метод {@link Triangle#exist(double, double, double)} проверяет, можно ли сформировать треугольник
 * из трех сторон с длинами {@code a}, {@code b}, {@code c}.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-03
 */
public class Triangle {

    /**
     * Первая точка треугольника.
     * Представляет одну из вершин треугольника.
     */
    private Point first;

    /**
     * Вторая точка треугольника.
     * Представляет одну из вершин треугольника.
     */
    private Point second;

    /**
     * Третья точка треугольника.
     * Представляет одну из вершин треугольника.
     */
    private Point third;

    /**
     * Конструктор {@code Triangle(Point ap, Point bp, Point cp)}
     * для создания треугольника с заданными точками.
     *
     * @param ap Первая точка треугольника.
     * @param bp Вторая точка треугольника.
     * @param cp Третья точка треугольника.
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод {@code semiPerimeter(double a, double b, double c)} вычисляет полупериметр треугольника.
     *
     * @param a Длина первой стороны треугольника.
     * @param b Длина второй стороны треугольника.
     * @param c Длина третьей стороны треугольника.
     * @return Полупериметр треугольника.
     */
    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод {@code exist(double ab, double ac, double bc)} проверяет, может ли треугольник существовать
     * по заданным длинам сторон.
     *
     * <p>Треугольник существует, если сумма длин любых двух сторон больше длины третьей стороны.</p>
     *
     * @param ab Длина первой стороны треугольника.
     * @param ac Длина второй стороны треугольника.
     * @param bc Длина третьей стороны треугольника.
     * @return {@code true}, если треугольник существует, {@code false} в противном случае.
     */
    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }

    /**
     * Метод {@code area()} вычисляет площадь треугольника, используя формулу Герона.
     * Если треугольник не существует (сумма длин двух сторон не больше третьей стороны),
     * возвращает -1.
     *
     * <p>Формула для расчета площади треугольника:
     * <br>Площадь = √(p * (p - a) * (p - b) * (p - c)),
     * где {@code p} — полупериметр треугольника, {@code a}, {@code b}, {@code c} — длины сторон треугольника.
     * </p>
     *
     * @return Площадь треугольника или -1, если треугольник не существует.
     */
    public double area() {
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (!this.exist(ab, ac, bc)) {
            return -1;
        }
        double p = semiPerimeter(ab, ac, bc);
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }
}
