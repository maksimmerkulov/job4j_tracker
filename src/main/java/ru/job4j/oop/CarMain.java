package ru.job4j.oop;

/**
 * Класс {@code CarMain} демонстрирует использование класса {@link Car}
 * и его вложенных нестатических классов {@link Car.Transmission},
 * {@link Car.Brakes} и {@link Car.TripComputer}.
 *
 * <p>Создается объект автомобиля, запускается двигатель, происходит ускорение,
 * торможение и вывод информации о марке и модели через бортовой компьютер.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Car car = new Car("Марка", "Модель");
 * Car.Transmission transmission = car.new Transmission();
 * Car.Brakes brakes = car.new Brakes();
 * Car.TripComputer tripComputer = car.new TripComputer();
 *
 * car.startEngine();
 * transmission.accelerate();
 * brakes.brake();
 * tripComputer.getInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Двигатель запущен
 * Ускорение
 * Торможение
 * Марка: Марка
 * Модель: Модель TripComputer
 * Модель TripComputer: Модель TripComputer
 * Модель Car: Модель
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CarMain {

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Car.Transmission transmission = car.new Transmission();
        Car.Brakes brakes = car.new Brakes();
        Car.TripComputer tripComputer = car.new TripComputer();
        car.startEngine();
        transmission.accelerate();
        brakes.brake();
        tripComputer.getInfo();
    }
}