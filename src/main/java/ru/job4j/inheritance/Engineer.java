package ru.job4j.inheritance;

/**
 * Класс {@code Engineer} наследуется от {@link Profession} и представляет инженера.
 *
 * <p>Содержит дополнительное поле — стаж работы в годах.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Engineer extends Profession {

    /**
     * Стаж инженера в годах.
     */
    private int experience;

    /**
     * Конструктор с двумя параметрами.
     *
     * <p>Создает объект {@code Engineer} с указанным стажем и наличием диплома.</p>
     *
     * @param experience Стаж работы в годах.
     * @param degree     Значение {@code true}, если есть диплом;
     *                   значение {@code false} — если нет.
     */
    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}