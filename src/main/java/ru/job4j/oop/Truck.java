package ru.job4j.oop;

/**
 * Класс {@code Truck} представляет собой конкретную реализацию транспортного средства — грузовика.
 *
 * <p>Расширяет абстрактный класс {@link Vehicle} и реализует специфическое поведение для методов
 * {@link #accelerate()} и {@link #steer()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Truck truck = new Truck();
 * truck.accelerate();
 * truck.steer();
 * truck.brake();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Электронная педаль газа
 * Стандартное рулевое управление
 * Стандартная тормозная система
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Truck extends Vehicle {

    /**
     * Реализация разгона грузовика.
     *
     * <p>Выводит сообщение о применении электронной педали газа.</p>
     */
    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    /**
     * Реализация поворота для грузовика.
     *
     * <p>Выводит сообщение о стандартной системе рулевого управления.</p>
     */
    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }
}
