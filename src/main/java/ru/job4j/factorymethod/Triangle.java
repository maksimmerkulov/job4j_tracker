package ru.job4j.factorymethod;

/**
 * Класс {@code Triangle} представляет собой реализацию фигуры — треугольника.
 *
 * <p>Используется в шаблоне {@code Factory Method} для создания конкретного объекта {@link Shape}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape shape = new Triangle(8, 4);
 * System.out.println(shape.draw());
 * System.out.println("Площадь фигуры равна: " + shape.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *    *
 *   * *
 *  *   *
 * *******
 * Площадь фигуры равна: 16.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Triangle implements Shape {

    /**
     * Основание треугольника.
     */
    int a;

    /**
     * Высота, проведенная к основанию.
     */
    int h;

    /**
     * Создает треугольник с заданным основанием и высотой.
     *
     * @param a основание треугольника
     * @param h высота треугольника
     */
    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    /**
     * Отображает схематическое изображение треугольника.
     *
     * @return строка, содержащая "рисунок" треугольника
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "   *" + ln
                + "  * *" + ln
                + " *   *" + ln
                + "*******";
    }

    /**
     * Вычисляет площадь треугольника по формуле {@code 0.5 * a * h}.
     *
     * @return площадь треугольника
     */
    @Override
    public double square() {
        return 0.5 * a * h;
    }
}
