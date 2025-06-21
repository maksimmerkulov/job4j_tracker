package ru.job4j.inheritance;

/**
 * Класс {@code Cat} представляет собой обычную живую кошку.
 *
 * <p>Содержит поведение, характерное для кошек — умение мурлыкать.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Cat cat = new Cat();
 * System.out.println(cat.canPurr());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Cat {

    /**
     * Проверяет, умеет ли кошка мурлыкать.
     *
     * <p>У всех живых кошек этот метод возвращает {@code true}.</p>
     *
     * @return Значение {@code true}, если кошка может мурлыкать.
     */
    public boolean canPurr() {
        return true;
    }
}