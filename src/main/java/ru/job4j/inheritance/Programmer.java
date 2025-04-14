package ru.job4j.inheritance;

/**
 * Класс {@code Programmer} описывает программиста.
 * Наследуется от {@link Engineer}.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-14
 */
public class Programmer extends Engineer {

    /**
     * Поле {@code programLanguage} указывает на язык программирования,
     * который использует программист.
     */
    private String programLanguage;

    /**
     * Конструктор {@code Programmer(String programLanguage, int experience, boolean degree)}.
     *
     * @param programLanguage Язык программирования.
     * @param experience      Опыт работы.
     * @param degree          Наличие диплома.
     */
    public Programmer(String programLanguage, int experience, boolean degree) {
        super(experience, degree);
        this.programLanguage = programLanguage;
    }
}