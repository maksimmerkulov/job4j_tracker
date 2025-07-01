package ru.job4j.polymorphism;

/**
 * Интерфейс {@code Transport} описывает поведение любого вида транспорта.
 *
 *<p>Включает методы для движения, посадки пассажиров и заправки.</p>
 *
 * <p>Пример реализации: {@link Bus}</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Transport {

    /**
     * Запускает движение транспорта.
     */
    void move();

    /**
     * Устанавливает количество пассажиров.
     *
     * @param count Количество пассажиров.
     */
    void passengers(int count);

    /**
     * Заправляет транспорт.
     *
     * @param fuel Количество топлива в литрах.
     * @return Стоимость заправки.
     */
    int refuel(int fuel);
}