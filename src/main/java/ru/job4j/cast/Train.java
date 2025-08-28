package ru.job4j.cast;

/**
 * Класс {@code Train} представляет собой транспортное средство – поезд.
 *
 * <p>Используется для моделирования железнодорожного транспорта.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Vehicle train = new Train();
 * train.type();
 * train.move();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Это поезд.
 * Поезд движется по рельсам.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Train implements Vehicle {

    /**
     * Выводит информацию о типе транспортного средства.
     *
     * <p>Сообщает, что экземпляр является поездом.</p>.
     */
    @Override
    public void type() {
        System.out.println("Это поезд.");
    }

    /**
     * Описывает, как поезд перемещается.
     *
     * <p>Выводит информацию о движении поезда по рельсам.</p>
     */
    @Override
    public void move() {
        System.out.println("Поезд движется по рельсам.");
    }
}
