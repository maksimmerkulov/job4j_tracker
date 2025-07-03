package ru.job4j.cast;

/**
 * Класс {@code Plane} представляет собой транспортное средство – самолет.
 *
 * <p>Используется для моделирования воздушного транспорта.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Vehicle plane = new Plane();
 * plane.type();
 * plane.move();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Это самолет.
 * Самолет летит по воздуху.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Plane implements Vehicle {

    /**
     * Выводит информацию о типе транспортного средства.
     *
     * <p>Сообщает, что экземпляр является самолетом.</p>
     */
    @Override
    public void type() {
        System.out.println("Это самолет.");
    }

    /**
     * Описывает, как самолет перемещается.
     *
     * <p>Выводит информацию о полете самолета по воздуху.</p>
     */
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху.");
    }
}