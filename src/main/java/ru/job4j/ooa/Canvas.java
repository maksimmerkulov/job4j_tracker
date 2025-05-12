package ru.job4j.ooa;

import java.util.Scanner;

/**
 * Класс {@code Canvas} представляет собой клиентскую часть для демонстрации работы
 * шаблона проектирования <b>Фабричный метод</b> с фигурами {@link Shape}.
 *
 * <p>Используется для запуска программы, в которой пользователь выбирает фигуру,
 * после чего применяется соответствующий оператор {@link ShapeOperator} для ее построения
 * и отображения информации (ASCII-графика и площадь).</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ShapeOperator operator = new RectangleOperator();
 * Canvas canvas = new Canvas(operator);
 * canvas.demonstrate();
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
public class Canvas {

    /**
     * Оператор фигуры, реализующий интерфейс {@link ShapeOperator}.
     */
    private ShapeOperator shapeOperator;

    /**
     * Конструктор принимает объект оператора, который создает и выводит фигуру.
     *
     * @param shapeOperator оператор фигуры
     */
    public Canvas(ShapeOperator shapeOperator) {
        this.shapeOperator = shapeOperator;
    }

    /**
     * Запускает демонстрацию работы оператора фигуры.
     */
    public void demonstrate() {
        this.shapeOperator.showInfo();
    }

    /**
     * Точка входа в программу.
     *
     * <p>Запрашивает у пользователя тип фигуры, создает соответствующего оператора
     * и выполняет демонстрацию через {@link Canvas}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShapeOperator operator;
        System.out.print("Какую фигуру вы хотите построить: ");
        String ans = input.nextLine();
        if ("прямоугольник".equals(ans)) {
            operator = new RectangleOperator();
        } else {
            operator = new TriangleOperator();
        }
        Canvas canvas = new Canvas(operator);
        canvas.demonstrate();
    }
}