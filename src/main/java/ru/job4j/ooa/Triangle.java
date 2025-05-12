package ru.job4j.ooa;

/**
 * Класс {@code Triangle} представляет треугольник, реализующий интерфейс {@link Shape}.
 *
 * <p>Используется в паттерне <b>Фабричный метод</b> как конкретная реализация фигуры.</p>
 *
 * <p>Класс предоставляет методы для отрисовки треугольника в виде ASCII-графики
 * и вычисления его площади по формуле: <i>(основание × высота) / 2</i>.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape triangle = new Triangle(6, 4);
 * System.out.println(triangle.draw());
 * System.out.println("Площадь: " + triangle.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *    *
 *   * *
 *  *   *
 * *******
 * Площадь: 12.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Triangle implements Shape {

    /**
     * Основание треугольника.
     */
    int a;

    /**
     * Высота треугольника.
     */
    int h;

    /**
     * Создает треугольник с указанным основанием и высотой.
     *
     * @param a основание треугольника
     * @param h высота треугольника
     */
    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    /**
     * Отрисовывает треугольник в виде псевдографики.
     *
     * @return строка с изображением треугольника
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
     * Вычисляет площадь треугольника.
     *
     * @return площадь по формуле {@code (a × h) / 2}
     */
    @Override
    public double square() {
        return 0.5 * a * h;
    }
}