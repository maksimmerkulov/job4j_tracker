package ru.job4j.polymorphism;

/**
 * Класс {@code Main} демонстрирует использование интерфейса {@link Vehicle}
 * на примере реализации {@link SportCar}.
 *
 * <p>Создает экземпляр {@link SportCar} и вызывает его методы, чтобы показать
 * типичное поведение спортивного автомобиля: переключение передач, ускорение,
 * рулевое управление, торможение, заправка и расчет аэродинамики.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Vehicle sportCar = new SportCar();
 * sportCar.changeGear();
 * sportCar.accelerate();
 * sportCar.steer();
 * sportCar.brake();
 * sportCar.refill();
 * Vehicle.getDragCoefficient();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Механическая коробка передач. Включить первую, дальше переключать до шестой
 * Электронная педаль газа
 * Укороченная рулевая рейка для ускоренного поворота руля
 * Усиленная тормозная система
 * Заправить 100л бензина
 * Формула расчета коэффициента аэродинамического сопротивления автомобиля
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Main {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link SportCar} и демонстрирует вызов его методов
     * через интерфейсную переменную {@link Vehicle}.</p>
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
        Vehicle.getDragCoefficient();
    }
}