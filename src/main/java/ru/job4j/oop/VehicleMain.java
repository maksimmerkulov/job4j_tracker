package ru.job4j.oop;

/**
 * Класс {@code VehicleMain} демонстрирует использование класса-наследника {@link Truck}
 * от абстрактного класса {@link Vehicle}.
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
public class VehicleMain {

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerate();
        truck.steer();
        truck.brake();
    }
}
