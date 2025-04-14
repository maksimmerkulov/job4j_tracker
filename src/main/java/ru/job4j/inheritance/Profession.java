package ru.job4j.inheritance;

/**
 * Класс {@code Profession} описывает профессию, имеющую или не имеющую диплом.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-14
 */
public class Profession {

    /**
     * Поле {@code degree} указывает на наличие диплома.
     */
    private boolean degree;

    /**
     * Конструктор {@code Profession}.
     *
     * @param degree Наличие диплома.
     */
    public Profession(boolean degree) {
        this.degree = degree;
    }
}