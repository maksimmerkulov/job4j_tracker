package ru.job4j.cast;

/**
 * Класс {@code VehicleMain} представляет собой демонстрацию полиморфизма транспортных средств.
 *
 * <p>Используется для создания различных типов транспорта, приведения их к общему типу
 * и вызова методов в цикле.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Vehicle plane = new Plane();
 * Vehicle train = new Train();
 * Vehicle bus = new Bus();
 * Vehicle[] vehicles = new Vehicle[] {plane, train, bus};
 * for (Vehicle object : vehicles) {
 *     object.type();
 *     object.move();
 *     System.out.println();
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Это самолет.
 * Самолет летит по воздуху.
 *
 * Это поезд.
 * Поезд движется по рельсам.
 *
 * Это автобус.
 * Автобус едет по скоростным трассам.
 *
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class VehicleMain {

    /**
     * Точка входа в программу.
     *
     * <p>Создает несколько объектов транспорта, приводит их к типу {@link Vehicle},
     * помещает в массив и демонстрирует полиморфизм — каждый объект вызывает
     * переопределенные методы {@code type()} и {@code move()}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[] {plane, train, bus};
        for (Vehicle object : vehicles) {
            object.type();
            object.move();
            System.out.println();
        }
    }
}