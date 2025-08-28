package ru.job4j.factorymethod;

import java.util.Scanner;

/**
 * Класс {@code TriangleOperator} представляет конкретного создателя,
 * реализующего фабричный метод {@link #createShape()} для создания треугольников.
 *
 * <p>Является частью шаблона проектирования {@code Factory Method}. Отвечает за получение данных от пользователя
 * и создание экземпляра {@link Triangle} с заданной длиной основания и высотой.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new TriangleOperator();
 * operator.showInfo();
 * }</pre>
 *
 * <p><b>Пример диалога:</b></p>
 * <pre>{@code
 * Введите длину основания треугольника: 6
 * Введите высоту треугольника: 4
 *    *
 *   * *
 *  *   *
 * *******
 * Площадь фигуры равна: 12.0
 * }</pre>
 *
 * @see ShapeOperator
 * @see Triangle
 * @see Shape
 * @author Maksim Merkulov
 * @version 1.1
 */
public class TriangleOperator extends ShapeOperator {

    /**
     * Сканер для получения пользовательского ввода.
     */
    private Scanner input = new Scanner(System.in);

    /**
     * Реализация фабричного метода для создания треугольника на основе пользовательского ввода.
     *
     * @return объект {@link Triangle} с заданными размерами
     */
    @Override
    public Shape createShape() {
        System.out.print("Введите длину основания треугольника: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Введите высоту треугольника: ");
        int b = Integer.parseInt(input.nextLine());
        return new Triangle(a, b);
    }
}
