package ru.job4j.inheritance;

/**
 * Класс {@code Engineer} описывает инженера с определенным стажем.
 * Наследуется от {@link Profession}.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-14
 */
public class Engineer extends Profession {

    /**
     * Поле {@code experience} хранит опыт работы инженера в годах.
     */
    private int experience;

    /**
     * Конструктор {@code Engineer(int experience, boolean degree)}.
     *
     * @param experience Опыт работы в годах.
     * @param degree     Наличие диплома.
     */
    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}