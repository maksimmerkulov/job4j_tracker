package ru.job4j.polymorphism;

/**
 * Класс {@code SportCar} представляет собой реализацию спортивного автомобиля,
 * оснащенного механической коробкой передач и спортивными компонентами управления.
 *
 * <p>Реализует интерфейс {@link Vehicle}, предоставляя специфичное для спортивного авто поведение:
 * резкое ускорение, укороченная рулевая рейка, усиленная тормозная система и увеличенный объем бака.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Vehicle car = new SportCar();
 * car.changeGear();
 * car.accelerate();
 * car.steer();
 * car.brake();
 * car.refill();
 * car.chargeBattery();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Механическая коробка передач. Включить первую, дальше переключать до шестой
 * Электронная педаль газа
 * Укороченная рулевая рейка для ускоренного поворота руля
 * Усиленная тормозная система
 * Заправить 100л бензина
 * Аккумулятор в багажнике. Зарядить.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class SportCar implements Vehicle {

    /**
     * Переключает передачи с использованием механической коробки.
     *
     * <p>Включает первую передачу, затем переключается вручную до шестой.</p>
     */
    @Override
    public void changeGear() {
        System.out.println("Механическая коробка передач. Включить первую, дальше переключать до шестой");
    }

    /**
     * Ускоряет автомобиль с помощью электронной педали газа.
     *
     * <p>Реагирует быстро и подходит для спортивного вождения.</p>
     */
    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    /**
     * Управляет автомобилем с помощью укороченной рулевой рейки.
     *
     * <p>Обеспечивает быструю реакцию на повороты руля.</p>
     */
    @Override
    public void steer() {
        System.out.println("Укороченная рулевая рейка для ускоренного поворота руля");
    }

    /**
     * Применяет усиленную тормозную систему для быстрой остановки.
     */
    @Override
    public void brake() {
        System.out.println("Усиленная тормозная система");
    }

    /**
     * Заправляет спортивный автомобиль топливом.
     *
     * <p>Рассчитано на объем 100 литров бензина.</p>
     */
    @Override
    public void refill() {
        System.out.println("Заправить 100л бензина");
    }

    /**
     * Заряжает аккумулятор автомобиля.
     *
     * <p>Аккумулятор установлен в багажнике. Метод может быть переопределен при необходимости.</p>
     */
    @Override
    public void chargeBattery() {
        System.out.println("Аккумулятор в багажнике. Зарядить.");
    }
}