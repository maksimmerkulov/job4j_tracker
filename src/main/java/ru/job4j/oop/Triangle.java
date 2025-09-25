package ru.job4j.oop;

import static java.lang.Math.sqrt;

/**
 * A geometric representation of a triangle defined by three {@link Point}
 * objects.
 *
 * <p>Example output:
 * <pre>{@code
 * 7.999999999999997
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Triangle {

    /**
     * The first vertex.
     */
    private Point first;

    /**
     * The second vertex.
     */
    private Point second;

    /**
     * The third vertex.
     */
    private Point third;

    /**
     * Creates a new {@code Triangle} with the specified vertices.
     *
     * @param ap the first point
     * @param bp the second point
     * @param cp the third point
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Returns the semi-perimeter of the triangle based on its side lengths.
     *
     * @param a the length of the first side
     * @param b the length of the second side
     * @param c the length of the third side
     * @return the semi-perimeter value
     */
    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Tests if a triangle can be formed with the given side lengths.
     *
     * @param ab the length of side AB
     * @param ac the length of side AC
     * @param bc the length of side BC
     * @return {@code true} if the triangle exists, {@code false} otherwise
     */
    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    /**
     * Returns the area of the triangle using Heron's formula.
     *
     * @return the area if the triangle exists, otherwise {@code -1}
     */
    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            result = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return result;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.area());
    }
}
