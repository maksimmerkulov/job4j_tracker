package ru.job4j.oop;

/**
 * Класс {@code Triangle} представляет треугольник, определенный тремя точками.
 * Включает методы для вычисления полупериметра, проверки существования треугольника
 * и вычисления его площади.
 *
 * <p>Класс использует {@code метод Герона} для вычисления площади треугольника, если он существует.
 * Метод {@link Triangle#exist(double, double, double)} проверяет, можно ли сформировать треугольник
 * из трех сторон с длинами {@code a}, {@code b}, {@code c}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Point a = new Point(0, 0);
 * Point b = new Point(4, 0);
 * Point c = new Point(0, 3);
 * Triangle triangle = new Triangle(a, b, c);
 * double area = triangle.area();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 6.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
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
     * Конструктор с параметрами.
     * Создает треугольник с заданными точками.
     *
     * @param ap первая точка треугольника
     * @param bp вторая точка треугольника
     * @param cp третья точка треугольника
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Вычисляет полупериметр треугольника.
     *
     * @param a длина первой стороны треугольника
     * @param b длина второй стороны треугольника
     * @param c длина третьей стороны треугольника
     * @return полупериметр треугольника
     */
    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Проверяет, может ли треугольник существовать по заданным длинам сторон.
     *
     * <p>Треугольник существует, если сумма длин любых двух сторон больше длины третьей стороны.</p>
     *
     * @param ab длина первой стороны треугольника
     * @param ac длина второй стороны треугольника
     * @param bc длина третьей стороны треугольника
     * @return {@code true}, если треугольник существует;
     *         {@code false} в противном случае
     */
    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }

    /**
     * Вычисляет площадь треугольника, используя формулу Герона.
     *
     * <p>Перед вычислением производится проверка: существует ли треугольник по заданным координатам
     * вершин. Если хотя бы две точки совпадают или все три лежат на одной прямой, метод
     * возвращает {@code -1}, так как треугольник невозможен.</p>
     *
     * <p>Если треугольник существует, площадь вычисляется по формуле Герона:</p>
     *
     * <pre>{@code
     * S = √(p * (p - a) * (p - b) * (p - c))
     * }</pre>
     *
     * где:
     * <ul>
     *   <li>{@code a}, {@code b}, {@code c} — длины сторон треугольника</li>
     *   <li>{@code p} — полупериметр треугольника: {@code (a + b + c) / 2}</li>
     * </ul>
     *
     * <p>Вычисление длин сторон производится с использованием метода {@link Point#distance(Point)}.</p>
     *
     * @return площадь треугольника, если он существует;
     *         {@code -1} — если треугольник невозможно построить
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
