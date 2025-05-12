package ru.job4j.ooa;

/**
 * Абстрактный класс {@code ShapeOperator} представляет собой шаблон создания объектов фигур
 * с использованием паттерна <b>Фабричный метод</b>.
 *
 * <p>Классы-наследники должны реализовать метод {@link #createShape()},
 * создающий конкретную фигуру, реализующую интерфейс {@link Shape}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new RectangleOperator();
 * operator.showInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Введите ширину прямоугольника: 4
 * Введите длину прямоугольника: 3
 * ******
 * *    *
 * *    *
 * ******
 * Площадь фигуры равна: 12.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public abstract class ShapeOperator {

    /**
     * Отображает фигуру и ее площадь.
     *
     * <p>Создает фигуру через {@link #createShape()}, затем выводит результаты методов
     * {@link Shape#draw()} и {@link Shape#square()} в консоль.</p>
     */
    public void showInfo() {
        Shape shape = createShape();
        System.out.println(shape.draw());
        System.out.println("Площадь фигуры равна: " + shape.square());
    }

    /**
     * Создает фигуру.
     *
     * <p>Должен быть реализован в подклассах для создания конкретного объекта {@link Shape}.</p>
     *
     * @return экземпляр фигуры
     */
    public abstract Shape createShape();
}