package ru.job4j.enumeration;

/**
 * Класс {@code CarService} демонстрирует использование перечисления {@link Status}
 * для отображения статуса автомобиля на СТО.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Status toyota = Status.FINISHED;
 * Status volvo = Status.WAITING;
 * System.out.println("Статус Toyota: " + toyota);
 * System.out.println("Статус Volvo: " + volvo);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Статус Toyota: FINISHED
 * Статус Volvo: WAITING
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class CarService {

    /**
     * Точка входа в программу, демонстрирующая работу с перечислением {@link Status}.
     *
     * <p>Создает и выводит различные статусы, показывает порядок и имена,
     * а также демонстрирует использование {@code switch} с {@link Status}.</p>
     *
     * @param args аргументы командной строки (не используются)
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
