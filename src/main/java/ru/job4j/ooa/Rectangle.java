package ru.job4j.ooa;

/**
 * Класс {@code Rectangle} представляет прямоугольник, реализующий интерфейс {@link Shape}.
 *
 * <p>Используется в паттерне <b>Фабричный метод</b> как конкретная реализация фигуры.</p>
 *
 * <p>Класс предоставляет функциональность для отрисовки прямоугольника в виде ASCII-графики
 * и вычисления его площади.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape rectangle = new Rectangle(4, 3);
 * System.out.println(rectangle.draw());
 * System.out.println("Площадь: " + rectangle.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ******
 * *    *
 * *    *
 * ******
 * Площадь: 12.0
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
     * @param a ширина прямоугольника
     * @param b высота прямоугольника
     */
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Отрисовывает прямоугольник в виде псевдографики.
     *
     * @return строка с изображением прямоугольника
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "******" + ln
                + "*    *" + ln
                + "*    *" + ln
                + "******";
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @return произведение ширины и высоты
     */
    @Override
    public double square() {
        return a * b;
    }
}