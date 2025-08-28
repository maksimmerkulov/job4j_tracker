package ru.job4j.inheritance;

/**
 * Класс {@code Programmer} наследуется от {@link Engineer} и представляет программиста.
 *
 * <p>Дополнительно содержит информацию о языке программирования.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
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
     * @param programLanguage язык программирования
     * @param experience      стаж работы в годах
     * @param degree          {@code true}, если есть диплом;
     *                        {@code false}, если нет
     */
    public Programmer(String programLanguage, int experience, boolean degree) {
        super(experience, degree);
        this.programLanguage = programLanguage;
    }
}
