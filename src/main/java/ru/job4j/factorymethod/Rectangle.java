package ru.job4j.factorymethod;

/**
 * Класс {@code Rectangle} представляет собой реализацию фигуры — прямоугольника.
 *
 * <p>Используется в шаблоне {@code Factory Method} для создания конкретного объекта {@link Shape}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape shape = new Rectangle(6, 4);
 * System.out.println(shape.draw());
 * System.out.println("Площадь фигуры равна: " + shape.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *  ******
 *  *    *
 *  *    *
 *  ******
 * Площадь фигуры равна: 24.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Rectangle implements Shape {

    /**
     * Ширина прямоугольника.
     */
    int a;

    /**
     * Высота прямоугольника.
     */
    int b;

    /**
     * Создает прямоугольник с заданными размерами.
     *
     * @param a Ширина прямоугольника.
     * @param b Высота прямоугольника.
     */
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Отображает схематическое изображение прямоугольника.
     *
     * @return Строка, содержащая "рисунок" прямоугольника.
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return "******" + ln
                + "*    *" + ln
                + "*    *" + ln
                + "******";
    }

    /**
     * Вычисляет площадь прямоугольника по формуле {@code a * b}.
     *
     * @return Площадь прямоугольника.
     */
    @Override
    public double square() {
        return a * b;
    }
}