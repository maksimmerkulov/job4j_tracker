package ru.job4j.oop;

/**
 * Класс {@code Story} представляет собой главную программу,
 * которая демонстрирует взаимодействие персонажей в истории
 * "Пионер Петя и Красная Шапочка".
 *
 * <p>История состоит из трех персонажей:</p>
 * <ul>
 *     <li>Петя – пионер, который может защитить Красную Шапочку от Волка.</li>
 *     <li>Красная Шапочка – девочка, которая может позвать Петю на помощь.</li>
 *     <li>Волк – злодей, который хочет съесть Красную Шапочку.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Pioneer petya = new Pioneer();
 * Girl girl = new Girl();
 * Wolf wolf = new Wolf();
 * girl.help(petya);
 * wolf.eat(girl);
 * petya.kill(wolf);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Красная Шапочка позвала Петю на помощь.
 * Волк попытался съесть Красную Шапочку.
 * Петя победил волка.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Story {

    /**
     * Запускает историю "Пионер Петя и Красная Шапочка".
     *
     * @param args аргументы командной строки (не используются)
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
