package ru.job4j.polymorphism;

/**
 * Класс {@code Bus} реализует интерфейс {@link Transport}.
 *
 * <p>Модель автобуса с базовыми действиями: движение, посадка пассажиров, заправка.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Bus bus = new Bus();
 * bus.move();
 * bus.passengers(30);
 * int cost = bus.refuel(50);
 * System.out.println("Стоимость заправки: " + cost);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Автобус едет по маршруту.
 * Количество пассажиров в автобусе: 30
 * Стоимость заправки: 2500
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see Transport
 */
public class Bus implements Transport {

    /**
     * Выводит сообщение о начале движения автобуса.
     *
     * <p>Реализация метода {@link Transport#move()}.</p>
     */
    @Override
    public void move() {
        System.out.println("Автобус едет по маршруту.");
    }

    /**
     * Выводит количество пассажиров в автобусе.
     *
     * <p>Реализация метода {@link Transport#passengers(int)}.</p>
     *
     * @param count Количество пассажиров.
     */
    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров в автобусе: " + count);
    }

    /**
     * Вычисляет стоимость заправки на основе фиксированной цены за литр.
     *
     * <p>Реализация метода {@link Transport#refuel(int)}.</p>
     *
     * @param fuel Количество топлива в литрах.
     * @return Стоимость заправки (fuel × pricePerLiter).
     */
    @Override
    public int refuel(int fuel) {
        int pricePerLiter = 50;
        return fuel * pricePerLiter;
    }

    /**
     * Главный метод для демонстрации работы класса {@code Bus}.
     *
     * <p>В методе выполняются операции с автобусом: движение,
     * посадка пассажиров, заправка и вывод результатов.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.move();
        bus.passengers(30);
        int refuelCost = bus.refuel(50);
        System.out.println("Стоимость заправки: " + refuelCost);
    }
}