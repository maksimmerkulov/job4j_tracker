package ru.job4j.oop;

/**
 * Класс {@code Athlete} расширяет абстрактный класс {@link Sportsman}
 * и реализует поведение легкоатлета.
 *
 * <p>Реализует метод {@link #run()} с описанием быстрой скорости бега,
 * а также добавляет метод {@link #sprint()} для быстрого рывка на короткую дистанцию.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Athlete athlete = new Athlete();
 * athlete.run();
 * athlete.sprint();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Быстрая скорость бега
 * Быстрый рывок на короткую дистанцию
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Athlete extends Sportsman {

    /**
     * Реализация метода бега.
     * Выводит сообщение о быстрой скорости бега легкоатлета.
     */
    @Override
    void run() {
        System.out.println("Быстрая скорость бега");
    }

    /**
     * Метод, имитирующий быстрый рывок на короткую дистанцию.
     */
    public void sprint() {
        System.out.println("Быстрый рывок на короткую дистанцию");
    }
}