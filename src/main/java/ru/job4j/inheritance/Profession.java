package ru.job4j.inheritance;

/**
 * Класс {@code Profession} представляет профессию и содержит информацию о наличии диплома.
 *
 * <p>Может использоваться как базовый класс для конкретных профессий.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Profession {

    /**
     * Флаг наличия диплома.
     */
    private boolean degree;

    /**
     * Конструктор с одним параметром.
     *
     * <p>Создает объект {@code Profession} с информацией о наличии диплома.</p>
     *
     * @param degree Значение {@code true}, если есть диплом;
     *               значение {@code false} — если нет.
     */
    public Profession(boolean degree) {
        this.degree = degree;
    }
}