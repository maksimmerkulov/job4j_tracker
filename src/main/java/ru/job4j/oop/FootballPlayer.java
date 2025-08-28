package ru.job4j.oop;

/**
 * Класс {@code FootballPlayer} расширяет абстрактный класс {@link Sportsman}
 * и реализует поведение футболиста.
 *
 * <p>Реализует метод {@link #run()} с описанием средней скорости бега,
 * а также добавляет метод {@link #footKick()} для удара по мячу.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FootballPlayer player = new FootballPlayer();
 * player.run();
 * player.footKick();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Средняя скорость бега
 * Удар ногой по мячу
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class FootballPlayer extends Sportsman {

    /**
     * Реализация метода бега.
     * Выводит сообщение о средней скорости бега футболиста.
     */
    @Override
    void run() {
        System.out.println("Средняя скорость бега");
    }

    /**
     * Метод, имитирующий удар ногой по мячу.
     */
    public void footKick() {
        System.out.println("Удар ногой по мячу");
    }
}
