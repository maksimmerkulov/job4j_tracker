package ru.job4j.oop;

/**
 * Класс {@code Pioneer} представляет собой персонажа Петю,
 * который может защитить Красную Шапочку от Волка.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Pioneer {

    /**
     * Метод {@code kill(Wolf wolf)} позволяет Пете победить Волка.
     *
     * @param wolf Объект класса {@code Wolf}, которого нужно победить.
     */
    public void kill(Wolf wolf) {
        System.out.println("Петя победил волка!");
    }
}