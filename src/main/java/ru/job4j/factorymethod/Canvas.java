package ru.job4j.factorymethod;

import java.util.Scanner;

/**
 * Класс {@code Canvas} является точкой входа и клиентом для демонстрации работы шаблона {@code Factory Method}.
 *
 * <p>Клиент получает объект {@link ShapeOperator} и вызывает у него метод {@link ShapeOperator#showInfo()},
 * который в свою очередь создает фигуру, отображает ее и вычисляет площадь.</p>
 *
 * <p>Выбор фигуры осуществляется через консольный ввод пользователя.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Какую фигуру вы хотите построить: прямоугольник
 * Введите ширину прямоугольника: 6
 * Введите длину прямоугольника: 4
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
public class Canvas {

    /**
     * Оператор фигуры, отвечающий за создание и отображение конкретной фигуры.
     */
    private ShapeOperator shapeOperator;

    /**
     * Создает экземпляр {@code Canvas} с заданным оператором фигур.
     *
     * @param shapeOperator оператор для работы с конкретной фигурой
     */
    public Canvas(ShapeOperator shapeOperator) {
        this.shapeOperator = shapeOperator;
    }

    /**
     * Запускает демонстрацию фигуры: создает и отображает фигуру и ее площадь.
     */
    public void demonstrate() {
        this.shapeOperator.showInfo();
    }

    /**
     * Точка входа в программу.
     *
     * <p>Запрашивает у пользователя тип фигуры, создает соответствующего
     * оператора и запускает демонстрацию работы шаблона.</p>
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
