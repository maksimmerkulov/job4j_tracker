package ru.job4j.inheritance;

/**
 * Класс {@code Programmer} наследуется от {@link Engineer} и представляет программиста.
 *
 * <p>Дополнительно содержит информацию о языке программирования.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Programmer extends Engineer {

    /**
     * Язык программирования, на котором пишет программист.
     */
    private String programLanguage;

    /**
     * Конструктор с тремя параметрами.
     *
     * <p>Создает объект {@code Programmer} с заданным языком программирования,
     * стажем и информацией о наличии диплома.</p>
     *
     * @param programLanguage Язык программирования.
     * @param experience      Стаж работы в годах.
     * @param degree          Значение {@code true}, если есть диплом;
     *                        значение {@code false} — если нет.
     */
    public Programmer(String programLanguage, int experience, boolean degree) {
        super(experience, degree);
        this.programLanguage = programLanguage;
    }
}