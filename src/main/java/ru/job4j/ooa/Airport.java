package ru.job4j.ooa;

/**
 * Класс {@code Airport} демонстрирует использование класса {@code Airbus}.
 *
 * <p>В этом классе создаются несколько экземпляров самолета {@code Airbus} с разными моделями,
 * и выводится информация о каждой модели, включая количество двигателей.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Airbus airbus = new Airbus("A320");
 * System.out.println(airbus);
 * airbus.printModel();
 * airbus.printCountEngine();
 *
 * airbus = new Airbus("A350");
 * System.out.println(airbus);
 * airbus.printModel();
 * airbus.printCountEngine();
 *
 * airbus.setName("A380");
 * System.out.println(airbus);
 * airbus.printModel();
 * airbus.printCountEngine();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Airbus{name='A320'}
 * Модель самолета: A320
 * Количество двигателей равно: 2
 *
 * Airbus{name='A350'}
 * Модель самолета: A350
 * Количество двигателей равно: 2
 *
 * Airbus{name='A380'}
 * Модель самолета: A380
 * Количество двигателей равно: 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Airport {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объекты {@code Airbus}, выводит информацию о моделях и количестве двигателей.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
        System.out.println();
        airbus = new Airbus("A350");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
        System.out.println();
        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
    }
}
