package ru.job4j.strategy;

/**
 * Класс {@code Paint} демонстрирует использование интерфейса {@link Shape}
 * для отрисовки различных фигур с помощью шаблона проектирования "Стратегия".
 *
 * <p>Позволяет динамически применять разные реализации {@link Shape}, такие как
 * {@link Triangle} и {@link Square}, и выводить их на консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Paint context = new Paint();
 * context.draw(new Triangle());
 * context.draw(new Square());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *    ^
 *  /   \
 * /_____\
 *  _______
 * |       |
 * |       |
 * |_______|
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Paint {

    /**
     * Отрисовывает переданную фигуру, используя метод {@link Shape#draw()}.
     *
     * <p>Фигура выводится на стандартный поток вывода.</p>
     *
     * @param shape Объект фигуры, реализующий интерфейс {@link Shape}.
     */
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    /**
     * Точка входа в программу. Демонстрирует отрисовку треугольника и квадрата.
     *
     * <p>Сначала создается объект {@link Paint}, затем вызывается метод {@code draw}
     * для различных реализаций интерфейса {@link Shape}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}