package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс {@code Police} демонстрирует использование класса {@link License}.
 *
 * <p>Создает объект лицензии, заполняет его данными и выводит информацию в консоль.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>
 * Petr Arsentev has a car - Toyota : xx111x
 * </pre>
 *
 * <p>Дата создается на момент выполнения программы.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class Police {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Создает и инициализирует объект {@link License}, затем выводит его данные в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car - "
                + license.getModel() + " : " + license.getCode());
    }
}