package ru.job4j.oop;

/**
 * Класс {@code Pioneer} представляет собой персонажа Петю,
 * который может защитить Красную Шапочку от Волка.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Pioneer {

    /**
     * Позволяет Пете победить Волка.
     *
     * @param wolf объект класса {@link Wolf}, которого нужно победить
     */
    public void kill(Wolf wolf) {
        System.out.println("Петя победил волка.");
    }
}
