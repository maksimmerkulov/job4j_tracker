package ru.job4j.factorymethod;

import java.util.Scanner;

/**
 * Класс {@code RectangleOperator} представляет конкретного создателя,
 * реализующего фабричный метод {@link #createShape()} для создания прямоугольников.
 *
 * <p>В рамках шаблона {@code Factory Method} этот класс выполняет ввод параметров фигуры
 * и возвращает экземпляр {@link Rectangle}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new RectangleOperator();
 * operator.showInfo();
 * }</pre>
 *
 * <p><b>Пример диалога:</b></p>
 * <pre>{@code
 * Введите ширину прямоугольника: 6
 * Введите длину прямоугольника: 4
 * ******
 * *    *
 * *    *
 * ******
 * Площадь фигуры равна: 24.0
 * }</pre>
 *
 * @see ShapeOperator
 * @see Rectangle
 * @see Shape
 * @author Maksim Merkulov
 * @version 1.1
 */
public class RectangleOperator extends ShapeOperator {

    /**
     * Сканер для получения пользовательского ввода.
     */
    private Scanner input = new Scanner(System.in);

    /**
     * Реализация фабричного метода для создания прямоугольника на основе пользовательского ввода.
     *
     * @return объект {@link Rectangle} с заданными размерами
     */
    @Override
    public Shape createShape() {
        System.out.print("Введите ширину прямоугольника: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Введите длину прямоугольника: ");
        int b = Integer.parseInt(input.nextLine());
        return new Rectangle(a, b);
    }
}
