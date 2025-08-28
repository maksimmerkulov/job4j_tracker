package ru.job4j.strategy;

/**
 * Класс {@code Triangle} представляет собой реализацию интерфейса {@link Shape}, которая рисует треугольник.
 *
 * <p>Используется для демонстрации шаблона проектирования "Стратегия", когда различные фигуры могут быть
 * отрисованы с помощью одного интерфейса {@link Shape}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape triangle = new Triangle();
 * System.out.print(triangle.draw());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *    ^
 *  /   \
 * /_____\
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Triangle implements Shape {

    /**
     * Возвращает строковое представление треугольника в псевдографике.
     *
     * <p>Каждая строка содержит символы, формирующие визуальный треугольник.</p>
     *
     * @return строка с изображением треугольника
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }
}
