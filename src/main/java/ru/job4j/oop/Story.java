package ru.job4j.oop;

/**
 * Класс {@code Story} представляет собой главную программу,
 * которая демонстрирует взаимодействие персонажей в истории
 * "Пионер Петя и Красная Шапочка".
 * <p>
 * История состоит из трех персонажей:
 * <ul>
 *     <li>Петя – пионер, который может защитить Красную Шапочку от Волка.</li>
 *     <li>Красная Шапочка – девочка, которая может позвать Петю на помощь.</li>
 *     <li>Волк – злодей, который хочет съесть Красную Шапочку.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Story {

    /**
     * Метод {@code main(String[] args)} запускает историю.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}