package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс {@code Police} демонстрирует работу с объектом {@link License}.
 *
 * <p>Создает лицензию, задает данные и выводит информацию о владельце и транспортном средстве.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * License license = new License();
 * license.setOwner("Petr Arsentev");
 * license.setModel("Toyota");
 * license.setCode("xx111x");
 * license.setCreated(new Date());
 * 
 * System.out.println(
 * license.getOwner() + " has a car - "
 * + license.getModel() + " : "
 * + license.getCode());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Petr Arsentev has a car - Toyota : xx111x
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Police {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link License}, устанавливает значения полей
     * и выводит информацию в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());
        System.out.println(
                license.getOwner() + " has a car - "
                        + license.getModel() + " : "
                        + license.getCode());
    }
}