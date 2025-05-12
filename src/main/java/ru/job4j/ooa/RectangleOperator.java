package ru.job4j.ooa;

import java.util.Scanner;

/**
 * Класс {@code RectangleOperator} представляет собой реализацию {@link ShapeOperator},
 * создающую фигуру {@link Rectangle} по пользовательскому вводу.
 *
 * <p>Применяет шаблон <b>Фабричный метод</b> для создания экземпляра {@code Rectangle}
 * с заданными пользователем сторонами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new RectangleOperator();
 * Shape rectangle = operator.createShape();
 * System.out.println(rectangle.draw());
 * System.out.println("Площадь: " + rectangle.square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Введите ширину прямоугольника: 3
 * Введите длину прямоугольника: 4
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
public class RectangleOperator extends ShapeOperator {

    /**
     * Сканер для получения пользовательского ввода.
     */
    private Scanner input = new Scanner(System.in);

    /**
     * Создает прямоугольник по введенным пользователем параметрам.
     *
     * <p>Запрашивает у пользователя ширину и длину прямоугольника.</p>
     *
     * @return объект {@link Rectangle}
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