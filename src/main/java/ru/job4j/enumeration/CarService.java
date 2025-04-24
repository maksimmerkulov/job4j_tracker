package ru.job4j.enumeration;

import ru.job4j.pojo.Student;

/**
 * Класс {@code CarService} демонстрирует использование перечисления {@link Status}
 * для описания состояния автомобилей на СТО.
 * <p>
 * Показывает: доступ к константам, использование методов {@code name()}, {@code ordinal()},
 * {@code valueOf()} и применение {@code switch}-выражения.
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Статус Toyota: FINISHED
 * Статус Volvo: WAITING
 * Название статуса: ACCEPTED, Порядковый номер статуса: 0
 * ...
 * Статус: Автомобиль принят на СТО
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
 */
public class CarService {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     * <p>
     * Демонстрирует работу с перечислением {@link Status}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
        switch (status) {
            case ACCEPTED:
                System.out.println("Статус: Автомобиль принят на СТО");
                break;
            case IN_WORK:
                System.out.println("Статус: Автомобиль в работе");
                break;
            case WAITING:
                System.out.println("Статус: Автомобиль ожидает запчасти");
                break;
            case FINISHED:
                System.out.println("Статус: Все работы завершены");
                break;
            default:
        }
    }
}