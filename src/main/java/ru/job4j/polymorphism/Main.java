package ru.job4j.polymorphism;

/**
 * Класс {@code Main} содержит точку входа в программу,
 * демонстрирующую использование различных транспортных средств.
 *
 * <p>В данном примере создается объект типа {@link SportCar}, который
 * реализует интерфейс {@link Vehicle}, и выполняются методы для управления автомобилем.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Vehicle sportCar = new SportCar();
 * sportCar.changeGear();
 * sportCar.accelerate();
 * sportCar.steer();
 * sportCar.brake();
 * sportCar.refill();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Механическая коробка передач. Включить первую, дальше переключать до шестой
 * Электронная педаль газа
 * Укороченная рулевая рейка для ускоренного поворота руля
 * Усиленная тормозная система
 * Заправить 100л бензина
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public class Main {

    /**
     * Точка входа в программу.
     * <p>Создает объект {@link SportCar}, вызывает методы для переключения передач,
     * ускорения, рулевого управления, торможения и заправки транспортного средства.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Vehicle sportCar = new SportCar();
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();
    }
}