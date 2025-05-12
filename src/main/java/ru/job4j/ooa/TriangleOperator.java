package ru.job4j.ooa;

import java.util.Scanner;

/**
 * Класс {@code TriangleOperator} представляет собой реализацию {@link ShapeOperator},
 * создающую фигуру {@link Triangle} по пользовательскому вводу.
 *
 * <p>Применяет шаблон <b>Фабричный метод</b> для создания экземпляра {@code Triangle}
 * с заданными пользователем основанием и высотой.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new TriangleOperator();
 * Shape triangle = operator.createShape();
 * System.out.println(triangle.draw());
 * System.out.println("Площадь: " + triangle.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Введите длину основания треугольника: 6
 * Введите высоту треугольника: 4
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
public class TriangleOperator extends ShapeOperator {

    /**
     * Сканер для получения пользовательского ввода.
     */
    private Scanner input = new Scanner(System.in);

    /**
     * Создает треугольник по введенным пользователем параметрам.
     *
     * <p>Запрашивает у пользователя длину основания и высоту треугольника.</p>
     *
     * @return объект {@link Triangle}
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