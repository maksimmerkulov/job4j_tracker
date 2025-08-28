package ru.job4j.factorymethod;

/**
 * Абстрактный класс {@code ShapeOperator} представляет собой
 * "создателя" в шаблоне проектирования {@code Factory Method}.
 *
 * <p>Определяет шаблонный метод {@link #showInfo()}, который выполняет:</p>
 * <ul>
 *   <li>Создание фигуры через {@link #createShape()} (фабричный метод)</li>
 *   <li>Отображение ее псевдографического представления</li>
 *   <li>Вычисление и вывод площади</li>
 * </ul>
 *
 * <p>Конкретные подклассы реализуют метод {@code createShape()} для создания разных фигур.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new RectangleOperator();
 * operator.showInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ******
 * *    *
 * *    *
 * ******
 * Площадь фигуры равна: 24.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public abstract class ShapeOperator {

    /**
     * Шаблонный метод, выполняющий демонстрацию фигуры:
     * создает фигуру, выводит ее изображение и площадь.
     */
    public void showInfo() {
        Shape shape = createShape();
        System.out.println(shape.draw());
        System.out.println("Площадь фигуры равна: " + shape.square());
    }

    /**
     * Фабричный метод, создающий фигуру.
     *
     * <p>Должен быть реализован в подклассах для создания конкретного типа {@link Shape}.</p>
     *
     * @return созданная фигура
     */
    public abstract Shape createShape();
}
