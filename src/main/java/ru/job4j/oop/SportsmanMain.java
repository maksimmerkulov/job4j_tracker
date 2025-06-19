package ru.job4j.oop;

/**
 * Класс {@code SportsmanMain} демонстрирует работу классов {@link Athlete} и {@link FootballPlayer}.
 *
 * <p>Создаются объекты спортсменов, у которых вызываются методы бега и специализированные действия.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Athlete athlete = new Athlete();
 * athlete.run();
 * athlete.sprint();
 *
 * FootballPlayer player = new FootballPlayer();
 * player.run();
 * player.footKick();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Быстрая скорость бега
 * Быстрый рывок на короткую дистанцию
 *
 * Средняя скорость бега
 * Удар ногой по мячу
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SportsmanMain {

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        FootballPlayer player = new FootballPlayer();
        athlete.run();
        athlete.sprint();
        player.run();
        player.footKick();
    }
}