package ru.job4j.strategy;

/**
 * Класс {@code Square} представляет собой реализацию интерфейса {@link Shape}, которая рисует квадрат.
 *
 * <p>Используется для демонстрации шаблона проектирования "Стратегия", когда различные фигуры могут быть
 * отрисованы с помощью одного интерфейса {@link Shape}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Shape square = new Square();
 * System.out.print(square.draw());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *  _______
 * |       |
 * |       |
 * |_______|
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Square implements Shape {

    /**
     * Возвращает строковое представление квадрата в псевдографике.
     *
     * <p>Каждая строка содержит символы, формирующие визуальный квадрат.</p>
     *
     * @return строка с изображением квадрата
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " _______ " + ln
                + "|       |" + ln
                + "|       |" + ln
                + "|_______|" + ln;
    }
}
