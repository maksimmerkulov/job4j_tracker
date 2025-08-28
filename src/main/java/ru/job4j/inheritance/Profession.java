package ru.job4j.inheritance;

/**
 * Класс {@code Profession} представляет профессию и содержит информацию о наличии диплома.
 *
 * <p>Может использоваться как базовый класс для конкретных профессий.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
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
     * @param degree {@code true}, если есть диплом;
     *               {@code false}, если нет
     */
    public Profession(boolean degree) {
        this.degree = degree;
    }
}
